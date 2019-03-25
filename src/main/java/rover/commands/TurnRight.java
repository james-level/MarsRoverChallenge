package rover.commands;

import rover.Rover;

public class TurnRight implements ICommand {

    @Override
    public void execute(final Rover rover){
        rover.turnRight();
    }

}
