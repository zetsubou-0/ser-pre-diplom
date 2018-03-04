package by.gstu.laser.api.model;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

@Model(adaptables = Resource.class)
public class Selection {

    private static final Logger LOG = LoggerFactory.getLogger(Selection.class);
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final JavaType TYPE = TypeFactory.defaultInstance().constructCollectionType(List.class, Option.class);

    @ValueMapValue(optional = true)
    private String dataSource;

    @Self
    private Resource resource;

    private List<Option> options;

    @PostConstruct
    protected void init() {
        if (dataSource == null) {
            return;
        }
        Optional.ofNullable(resource)
                .map(Resource::getResourceResolver)
                .map(resolver -> resolver.getResource(dataSource))
                .ifPresent(this::initOptions);
    }

    private void initOptions(Resource resource) {
        try (InputStream in = resource.adaptTo(InputStream.class)) {
            options = MAPPER.readValue(in, TYPE);
        } catch (IOException e) {
            LOG.error(e.getMessage(), e);
        }
    }

    public List<Option> getOptions() {
        return options;
    }

    public static final class Option {
        private String key;
        private String value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
