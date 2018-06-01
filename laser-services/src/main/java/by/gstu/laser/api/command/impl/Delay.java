package by.gstu.laser.api.command.impl;

import by.gstu.laser.api.command.GCodeCommand;
import by.gstu.laser.api.model.GCodeModel;

public class Delay extends GCodeCommand {

    public static final String DELAY_PATTERN = "S1 %s;";

    public Delay(GCodeModel model) {
        super(model);
    }

    @Override
    public String getCommandLine() {
        return String.format(DELAY_PATTERN, (long) (2000.0 / getModel().getSpeed()));
    }
}
