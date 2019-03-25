package rover.commands;
import rover.Rover;

    // Interface which defines functionality that different commands share
public interface ICommand {
    public void execute(final Rover rover);
}
