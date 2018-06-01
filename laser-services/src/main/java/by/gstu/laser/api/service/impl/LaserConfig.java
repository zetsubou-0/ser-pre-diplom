package by.gstu.laser.api.service.impl;

import org.apache.felix.scr.annotations.*;
import org.apache.sling.commons.osgi.PropertiesUtil;

import java.util.Map;

@Component(
        label = "Laser config",
        metatype = true
)
@Service(LaserConfig.class)
public class LaserConfig {

    private static final double DEFAULT_POWER = 100.0;
    private static final double DEFAULT_MIN_SPEED = 1.0;
    private static final double DEFAULT_MIN_DELTA = 0.0001;

    @Property(
            label = "Laser power",
            description = "Laser configuration. Power (Watt)",
            doubleValue = DEFAULT_POWER
    )
    private static final String POWER = "laser.power";
    @Property(
            label = "Laser minimal speed",
            description = "Laser minimal speed",
            doubleValue = DEFAULT_MIN_SPEED
    )
    private static final String MIN_SPEED = "laser.min.speed";
    @Property(
            label = "Laser focus min delta",
            description = "Laser focus min delta",
            doubleValue = DEFAULT_MIN_DELTA
    )
    private static final String MIN_FOCUS_DELTA = "laser.min.delta";

    private double power;
    private double minSpeed;
    private double minFocusDelta;

    @Activate
    @Modified
    protected void activate(Map<String, Object> properties) {
        power = PropertiesUtil.toDouble(properties.get(POWER), DEFAULT_POWER);
        minSpeed = PropertiesUtil.toDouble(properties.get(MIN_SPEED), DEFAULT_MIN_SPEED);
        minFocusDelta = PropertiesUtil.toDouble(properties.get(MIN_FOCUS_DELTA), DEFAULT_MIN_DELTA);
    }

    public double getPower() {
        return power;
    }

    public double getMinSpeed() {
        return minSpeed;
    }

    public double getMinFocusDelta() {
        return minFocusDelta;
    }
}
