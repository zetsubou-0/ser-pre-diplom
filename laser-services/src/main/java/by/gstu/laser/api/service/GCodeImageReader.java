package by.gstu.laser.api.service;

import by.gstu.laser.api.model.ImageModel;
import org.apache.sling.api.SlingHttpServletRequest;

public interface    GCodeImageReader {
    ImageModel readImage(SlingHttpServletRequest request);
}
