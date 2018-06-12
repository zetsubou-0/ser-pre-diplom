package by.gstu.laser.api.rest.servlet;

import by.gstu.laser.api.model.ImageModel;
import by.gstu.laser.api.service.GCodeImageReader;
import by.gstu.laser.api.util.IOUtil;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;

import javax.servlet.ServletException;
import java.io.IOException;

@SlingServlet(paths = "/bin/laser/gCode")
public final class GCodeServlet extends SlingAllMethodsServlet {

    @Reference
    private GCodeImageReader imageReader;

    @Override
    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException, ServletException {
        final ImageModel image = imageReader.readImage(request);
        response.sendRedirect("/content/laser/home.html" + IOUtil.getParams(image));
    }
}
