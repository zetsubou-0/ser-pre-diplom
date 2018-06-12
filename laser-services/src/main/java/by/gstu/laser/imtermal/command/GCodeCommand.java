package by.gstu.laser.imtermal.command;

import by.gstu.laser.api.model.GCodeModel;

public abstract class GCodeCommand {
    private final GCodeModel model;

    public GCodeCommand() {
        model = null;
    }

    public GCodeCommand(GCodeModel model) {
        this.model = model;
    }

    public abstract String getCommandLine();

    public GCodeModel getModel() {
        return model;
    }
}
