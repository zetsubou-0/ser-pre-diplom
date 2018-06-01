package by.gstu.laser.api.service;

import by.gstu.laser.api.model.GCodeModel;
import org.apache.sling.api.request.RequestParameter;

import java.util.List;

public interface GCodeImageReader {
    List<GCodeModel> readImage(RequestParameter requestParameter);
}
