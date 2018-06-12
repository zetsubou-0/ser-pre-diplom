package by.gstu.laser.imtermal.command.impl;

import by.gstu.laser.imtermal.command.GCodeCommand;
import by.gstu.laser.api.model.GCodeModel;

public class Move extends GCodeCommand {

    public static final String MOVE_PATTERN = "G01 X%s Y%s F%s;\n";

    public Move(GCodeModel model) {
        super(model);
    }

    @Override
    public String getCommandLine() {
        final GCodeModel model = getModel();
        return String.format(MOVE_PATTERN, model.getHorizontalPosition(), model.getVerticalPosition(), model.getSpeed());
    }
}
