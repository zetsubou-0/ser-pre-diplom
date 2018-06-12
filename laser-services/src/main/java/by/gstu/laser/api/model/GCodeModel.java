package by.gstu.laser.api.model;

import by.gstu.laser.api.service.impl.LaserConfig;

public class GCodeModel {
    private final long horizontalPosition;
    private final long verticalPosition;
    private final long speed;

    public GCodeModel(LaserConfig config, long horizontalPosition, long verticalPosition, double focus) {
        this.horizontalPosition = horizontalPosition;
        this.verticalPosition = verticalPosition;
        speed = Math.round(config.getMinSpeed() + config.getPower() / (focus + config.getMinFocusDelta()));
    }

    public long getHorizontalPosition() {
        return horizontalPosition;
    }

    public long getVerticalPosition() {
        return verticalPosition;
    }

    public long getSpeed() {
        return speed;
    }
}
