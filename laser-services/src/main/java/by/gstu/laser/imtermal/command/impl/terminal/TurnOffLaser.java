package by.gstu.laser.imtermal.command.impl.terminal;

import by.gstu.laser.imtermal.command.GCodeCommand;

public class TurnOffLaser extends GCodeCommand {
    @Override
    public String getCommandLine() {
        return "M42 P6 S0;\n";
    }
}
