package by.gstu.laser.imtermal.command.impl.initial;

import by.gstu.laser.imtermal.command.GCodeCommand;

public class TurnOnCooler extends GCodeCommand {
    @Override
    public String getCommandLine() {
        return "M42 P5 S255;\n";
    }
}
