package by.gstu.laser.api.service;

import by.gstu.laser.api.command.GCodeCommand;
import by.gstu.laser.api.model.GCodeModel;

import java.util.List;

public interface GCodeCommandProcessor {
    List<GCodeCommand> convertToCommands(List<GCodeModel> models);
}
