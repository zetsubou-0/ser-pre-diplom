package by.gstu.laser.imtermal.command.impl.terminal;

import by.gstu.laser.imtermal.command.GCodeCommand;

public class TurnOffCooler extends GCodeCommand {
    @Override
    public String getCommandLine() {
        return "M42 P5 S0;\n";
    }
}
