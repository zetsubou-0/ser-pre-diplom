package by.gstu.laser.api.command.impl;

import by.gstu.laser.api.command.GCodeCommand;
import by.gstu.laser.api.model.GCodeModel;

public class Move extends GCodeCommand {

    public static final String MOVE_PATTERN = "G0 x-%s y-%s;";

    public Move(GCodeModel model) {
        super(model);
    }

    @Override
    public String getCommandLine() {
        final GCodeModel model = getModel();
        return String.format(MOVE_PATTERN, model.getHorizontalPosition(), model.getVerticalPosition());
    }
}
