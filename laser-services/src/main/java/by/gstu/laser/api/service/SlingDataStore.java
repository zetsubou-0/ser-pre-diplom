package by.gstu.laser.api.service;

import by.gstu.laser.imtermal.command.GCodeCommand;
import org.apache.sling.api.resource.ResourceResolver;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

public interface SlingDataStore {
    String saveImage(ResourceResolver resolver, BufferedImage image, String name) throws IOException;
    String saveCommands(ResourceResolver resolver, List<GCodeCommand> commands, String name) throws IOException;
}
