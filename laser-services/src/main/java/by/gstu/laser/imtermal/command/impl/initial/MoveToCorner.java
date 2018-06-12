package by.gstu.laser.imtermal.command.impl.initial;

import by.gstu.laser.imtermal.command.GCodeCommand;

public class MoveToCorner extends GCodeCommand {
    @Override
    public String getCommandLine() {
        return "G28 X Y;\n";
    }
}
