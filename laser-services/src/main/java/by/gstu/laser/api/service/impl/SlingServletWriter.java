package by.gstu.laser.api.service.impl;

import by.gstu.laser.api.command.GCodeCommand;
import by.gstu.laser.api.service.Writer;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.SlingHttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

@Component
@Service
public class SlingServletWriter implements Writer {

    @Override
    public void printInfoLine(SlingHttpServletResponse response, String text) throws IOException {
        final PrintWriter out = response.getWriter();
        out.println(text);
    }

    @Override
    public void printGCodeLine(SlingHttpServletResponse response, Collection<GCodeCommand> commands) throws IOException {
        final PrintWriter out = response.getWriter();
        response.setContentType("text/plain");
        response.setHeader( "Content-Disposition", "attachment;filename=code.cn");
        commands.stream()
                .map(GCodeCommand::getCommandLine)
                .forEach(out::println);
    }
}
