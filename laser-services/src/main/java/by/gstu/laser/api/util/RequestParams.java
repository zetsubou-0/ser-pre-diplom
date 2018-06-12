package by.gstu.laser.api.util;

public enum RequestParams {
    ORIGINAL("gcode.image-original"),
    BLACK_WHITE("gcode.image-black-white"),
    SOURCE("gcode.image-source-path");

    private final String value;

    RequestParams(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
