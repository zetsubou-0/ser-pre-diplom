package by.gstu.laser.api.servlet;

import by.gstu.laser.api.model.GCodeModel;
import by.gstu.laser.api.service.GCodeCommandProcessor;
import by.gstu.laser.api.service.GCodeImageReader;
import by.gstu.laser.api.service.Writer;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.request.RequestParameter;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;

@SlingServlet(paths = "/bin/laser/gCode")
public final class GCodeServlet extends SlingAllMethodsServlet {

    @Reference
    private GCodeImageReader imageReader;

    @Reference
    private GCodeCommandProcessor processor;

    @Reference
    private Writer writer;

    @Override
    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        final RequestParameter sourceImageFile = request.getRequestParameter("file");
        if (sourceImageFile == null) {
            writer.printInfoLine(response, "Source image is null");
        }
        final List<GCodeModel> models = imageReader.readImage(sourceImageFile);
        writer.printGCodeLine(response, processor.convertToCommands(models));
    }
}
