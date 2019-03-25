package rover;

import rover.commands.ICommand;
import rover.environment.Coords;
import rover.environment.Direction;
import rover.environment.Plateau;

import java.util.List;

public class Rover {

    private Coords currentCoords;
    private Direction currentDirection;
    private Plateau plateau;

    public Rover(final Plateau plateau, final Coords coords, final Direction direction){
        this.plateau = plateau;
        this.currentDirection = direction;
        this.currentCoords = coords;
    }

    // Executes all commands (in sequence) for rover
    public void run(final String commandString){
        List<ICommand> roverCommands = new StringCommandParser(commandString).toCommands();
        for (ICommand command : roverCommands){
            command.execute(this);
        }
    }

    public String stateCurrentLocation(){
        return currentCoords.toString() + " " + currentDirection.toString();
    }

    // Changes rover's orientation anticlockwise
    public void turnLeft() {
        this.currentDirection = this.currentDirection.left();
    }

    // Changes rover's orientation clockwise
    public void turnRight() {
        this.currentDirection = this.currentDirection.right();
    }

    // Moves rover utilising starting orientation
    public void move() {
        Coords locationAfterMove = currentCoords.coordsAfterMove(currentDirection.movementForXAxis(), currentDirection.movementForYAxis());

        // Ignores the command if the move would take rover out of bounds
        if(plateau.withinBoundary(locationAfterMove))
            currentCoords = currentCoords.newCoordsFor(currentDirection.movementForXAxis(), currentDirection.movementForYAxis());
    }
}
