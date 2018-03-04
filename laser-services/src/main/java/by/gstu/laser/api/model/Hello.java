package by.gstu.laser.api.model;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;

import javax.annotation.PostConstruct;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Hello {

    @Self
    private Resource resource;

    private String text;

    @PostConstruct
    protected void init() {
        text = "This base page - " + resource.getPath();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
