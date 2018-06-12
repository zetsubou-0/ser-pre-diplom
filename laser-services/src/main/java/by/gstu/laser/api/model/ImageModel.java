package by.gstu.laser.api.model;


import org.apache.commons.lang3.StringUtils;

public class ImageModel {
    private final String originImagePath;
    private final String blackWhiteImagePath;
    private final String sourcePath;

    public ImageModel(String originImagePath, String blackWhiteImagePath, String sourcePath) {
        this.originImagePath = originImagePath;
        this.blackWhiteImagePath = blackWhiteImagePath;
        this.sourcePath = sourcePath;
    }

    public static ImageModel empty() {
        return new ImageModel(StringUtils.EMPTY, StringUtils.EMPTY, StringUtils.EMPTY);
    }

    public String getOriginImagePath() {
        return originImagePath;
    }

    public String getBlackWhiteImagePath() {
        return blackWhiteImagePath;
    }

    public String getSourcePath() {
        return sourcePath;
    }
}
