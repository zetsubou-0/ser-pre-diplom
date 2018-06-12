package by.gstu.laser.api.service.impl;

import by.gstu.laser.imtermal.command.GCodeCommand;
import by.gstu.laser.api.model.GCodeModel;
import by.gstu.laser.api.service.GCodeCommandProcessor;
import by.gstu.laser.imtermal.command.impl.Move;
import by.gstu.laser.imtermal.command.impl.initial.MoveToCorner;
import by.gstu.laser.imtermal.command.impl.initial.Reset;
import by.gstu.laser.imtermal.command.impl.initial.TurnOnCooler;
import by.gstu.laser.imtermal.command.impl.terminal.TurnOffCooler;
import by.gstu.laser.imtermal.command.impl.terminal.TurnOffLaser;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
@Service
public class GCodeCommandProcessorImpl implements GCodeCommandProcessor {

    @Override
    public List<GCodeCommand> convertToCommands(List<GCodeModel> models) {
        final Stream<GCodeCommand> initialCommands = Stream.of(new MoveToCorner(), new Reset(), new TurnOnCooler());
        final Stream<GCodeCommand> terminalCommands = Stream.of(new TurnOffLaser(), new TurnOffCooler());
        final Stream<GCodeCommand> commands = models.stream()
                .map(Move::new);
        return Stream.of(initialCommands, commands, terminalCommands)
                .flatMap(Function.identity())
                .collect(Collectors.toList());
    }
}
