package by.gstu.laser.api.service.impl;

import by.gstu.laser.api.model.GCodeModel;
import by.gstu.laser.api.model.ImageModel;
import by.gstu.laser.api.service.SlingDataStore;
import by.gstu.laser.api.service.GCodeCommandProcessor;
import by.gstu.laser.api.service.GCodeImageReader;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.request.RequestParameter;
import org.apache.sling.api.resource.ResourceResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@Service
public class GCodeImageReaderImpl implements GCodeImageReader {

    private static final Logger LOG = LoggerFactory.getLogger(GCodeImageReaderImpl.class);

    @Reference
    private LaserConfig laserConfig;
    @Reference
    private SlingDataStore dataStore;
    @Reference
    private GCodeCommandProcessor processor;

    @Override
    public ImageModel readImage(SlingHttpServletRequest request) {
        final RequestParameter sourceImageFile = request.getRequestParameter("file");
        if (sourceImageFile == null) {
            return ImageModel.empty();
        }
        try (InputStream in = getInputStream(sourceImageFile)) {
            final BufferedImage image = ImageIO.read(in);
            if (image == null) {
                LOG.warn("Buffered image is null");
                return ImageModel.empty();
            }
            final ResourceResolver resolver = request.getResourceResolver();
            final String imagePath = dataStore.saveImage(resolver, image, "original.jpg");
            final BufferedImage monochromeImage = toMonochrome(image);
            final String monochromeImagePath = dataStore.saveImage(resolver, monochromeImage, "black-white.jpg");
            final List<GCodeModel> models = getModels(monochromeImage);
            final String sourcePath = dataStore.saveCommands(resolver, processor.convertToCommands(models), "g-code.txt");
            return new ImageModel(imagePath, monochromeImagePath, sourcePath);
        } catch (IOException e) {
            LOG.error(e.getMessage(), e);
            return ImageModel.empty();
        }
    }

    private List<GCodeModel> getModels(BufferedImage monochromeImage) {
        final int width = monochromeImage.getWidth();
        final int height = monochromeImage.getHeight();
        final List<GCodeModel> models = new ArrayList<>(width * height);
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                models.add(new GCodeModel(laserConfig, x, y, getFocusValue(monochromeImage.getRGB(x, y))));
            }
        }
        return models;
    }

    private double getFocusValue(int rgb) {
        return 255.0 - (rgb + 16777217.0) * 255.0 / 16777216.0;
    }

    private BufferedImage toMonochrome(BufferedImage image) {
        final BufferedImage result = new BufferedImage(
                image.getWidth(),
                image.getHeight(),
                BufferedImage.TYPE_BYTE_GRAY);
        final Graphics2D graphic = result.createGraphics();
        graphic.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
        graphic.dispose();
        return result;
    }

    private BufferedInputStream getInputStream(RequestParameter requestParameter) throws IOException {
        return Optional.ofNullable(requestParameter.getInputStream())
                .map(BufferedInputStream::new)
                .orElse(new BufferedInputStream(new ByteArrayInputStream(ArrayUtils.EMPTY_BYTE_ARRAY)));
    }
}
