package by.gstu.laser.api.service.impl;

import by.gstu.laser.api.service.SlingDataStore;
import by.gstu.laser.api.util.IOUtil;
import by.gstu.laser.imtermal.command.GCodeCommand;
import org.apache.commons.lang3.StringUtils;
import org.apache.felix.scr.annotations.*;
import org.apache.felix.scr.annotations.Component;
import org.apache.sling.api.resource.*;
import org.apache.sling.commons.osgi.PropertiesUtil;

import javax.jcr.RepositoryException;
import javax.jcr.Session;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component(metatype = true)
@Service
@Properties(
        @Property(label = "Image root path", description = "JCR path for gcode data", name = SlingDataStoreImpl.PN_PATH, value = SlingDataStoreImpl.DEFAULT_PATH)
)
public class SlingDataStoreImpl implements SlingDataStore {

    protected static final String DEFAULT_PATH = "/etc/laser/data";
    protected static final String PN_PATH = "gcode.data.path";
    private static final SimpleDateFormat FORMAT = new SimpleDateFormat("/yyyy/MM/dd");

    private String path;

    @Activate
    @Modified
    protected void activate(Map<String, Object> properties) {
        path = PropertiesUtil.toString(properties.get(PN_PATH), DEFAULT_PATH);
    }

    @Override
    public String saveImage(ResourceResolver resolver, BufferedImage image, String name) throws IOException {
        final Session session = resolver.adaptTo(Session.class);
        if (session == null) {
            return StringUtils.EMPTY;
        }
        try {
            return IOUtil.createImageFile(session, image, getRootPath(), name);
        } catch (RepositoryException e) {
            throw new IOException(e);
        }
    }

    @Override
    public String saveCommands(ResourceResolver resolver, List<GCodeCommand> commands, String name) throws IOException {
        final Session session = resolver.adaptTo(Session.class);
        if (session == null) {
            return StringUtils.EMPTY;
        }
        try {
            return IOUtil.createFile(session, commands, getRootPath(), name);
        } catch (RepositoryException e) {
            throw new IOException(e);
        }
    }

    private String getRootPath() {
        return path + FORMAT.format(new Date());
    }
}
