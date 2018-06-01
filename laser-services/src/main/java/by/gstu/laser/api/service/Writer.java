package by.gstu.laser.api.service;

import by.gstu.laser.api.command.GCodeCommand;
import org.apache.sling.api.SlingHttpServletResponse;

import java.io.IOException;
import java.util.Collection;

public interface Writer {
    void printInfoLine(SlingHttpServletResponse response, String text) throws IOException;
    void printGCodeLine(SlingHttpServletResponse response, Collection<GCodeCommand> commands) throws IOException;
}
