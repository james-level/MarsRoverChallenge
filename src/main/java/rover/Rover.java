package rover;

import rover.environment.Coords;
import rover.environment.Direction;
import rover.environment.Plateau;

public class Rover {

    private Coords currentCoords;
    private Direction currentDirection;
    private Plateau plateau;

    public Rover(final Plateau plateau, final Coords coords, final Direction direction){
        this.plateau = plateau;
        this.currentDirection = direction;
        this.currentCoords = coords;
    }

    public String stateCurrentLocation(){
        return currentCoords.toString() + " " + currentDirection.toString();
    }

    public void turnLeft() {
        this.currentDirection = this.currentDirection.left();
    }

    public void turnRight() {
        this.currentDirection = this.currentDirection.right();
    }
}
