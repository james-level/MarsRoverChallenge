package rover.parser;

import rover.commands.ICommand;
import rover.commands.Move;
import rover.commands.TurnLeft;
import rover.commands.TurnRight;

import java.util.*;

public class CommandListBuilder {

    public static final String BY_EACH_CHARACTER = "";
    public static final int START_INDEX = 0;

    private static Map<String, ICommand> stringToCommandMap = new HashMap<String, ICommand>() {{
        put("L", new TurnLeft());
        put("R", new TurnRight());
        put("M", new Move());
    }};

    private String command;

    public CommandListBuilder(final String command) {
        this.command = command;
    }

    // Sends 'command' to interface (for execution)
    public List<ICommand> toCommands() {
        if(isNullOrEmpty(command)) return new ArrayList<ICommand>();
        return buildCommandsList(command);
    }

    // Creates command list, mapping strings to actions (ensures command is not null)
    private List<ICommand> buildCommandsList(final String command) {
        List<ICommand> commands = new ArrayList<ICommand>();

        for(String commandCharacter : commandCharactersFrom(command)) {
            if (commandCharacter == null) break;
            ICommand mappedCommand = lookupEquivalentCommand(commandCharacter.toUpperCase());
            commands.add(mappedCommand);
        }

        return commands;
    }

    // Checks if command is null or empty string
    private boolean isNullOrEmpty(final String commandString) {
        return (null == commandString || commandString.trim().length() == 0);
    }

    // Formats command - returns array of strings
    private String[] commandCharactersFrom(final String commandString) {
        return Arrays.copyOfRange(commandString.split(BY_EACH_CHARACTER), START_INDEX, commandString.length() + 1);
    }

    // Looks up relevant key in hash map and returns corresponding value
    private ICommand lookupEquivalentCommand(final String commandString) {
        return stringToCommandMap.get(commandString);
    }

}
