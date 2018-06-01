package by.gstu.laser.api.service.impl;

import by.gstu.laser.api.command.GCodeCommand;
import by.gstu.laser.api.command.impl.Delay;
import by.gstu.laser.api.command.impl.Move;
import by.gstu.laser.api.model.GCodeModel;
import by.gstu.laser.api.service.GCodeCommandProcessor;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
@Service
public class GCodeCommandProcessorImpl implements GCodeCommandProcessor {

    @Override
    public List<GCodeCommand> convertToCommands(List<GCodeModel> models) {
        return models.stream()
                .flatMap(this::toCommands)
                .collect(Collectors.toList());
    }

    private Stream<GCodeCommand> toCommands(GCodeModel model) {
        return Stream.of(new Move(model), new Delay(model));
    }
}
