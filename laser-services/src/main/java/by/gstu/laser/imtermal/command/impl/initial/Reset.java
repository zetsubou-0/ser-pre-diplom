package by.gstu.laser.imtermal.command.impl.initial;

import by.gstu.laser.imtermal.command.GCodeCommand;

public class Reset extends GCodeCommand {
    @Override
    public String getCommandLine() {
        return "G92 X0 Y0;\n";
    }
}
