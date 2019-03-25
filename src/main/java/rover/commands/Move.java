package rover.commands;

import rover.Rover;

public class Move implements ICommand {

    public void execute(Rover rover){
        rover.move();
    }
}
