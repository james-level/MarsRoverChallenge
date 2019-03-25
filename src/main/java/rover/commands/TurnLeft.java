package rover.commands;

import rover.Rover;

public class TurnLeft implements ICommand {

    @Override
    public void execute(final Rover rover){
        rover.turnLeft();
    }

}
