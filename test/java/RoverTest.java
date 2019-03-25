
import org.junit.Assert;
import org.junit.Test;
import rover.Rover;
import rover.environment.Coords;
import rover.environment.Direction;
import rover.environment.Plateau;


public class RoverTest {


    @Test
    public void statesCurrentLocationAsString() {
        // Given
        Plateau plateau = new Plateau(5,5);
        Coords startingLocation = new Coords(2, 5);

        // When
        Rover rover = new Rover(plateau, startingLocation, Direction.N);

        // Then
        Assert.assertEquals("2 5 N", rover.stateCurrentLocation());

    }

    @Test
    public void canTurnLeft() {
        // Given
        Plateau plateau = new Plateau(5, 5);
        Coords startingLocation = new Coords(2, 4);
        Rover rover = new Rover(plateau, startingLocation, Direction.W);

        // When
        rover.turnLeft();

        // Then
        Assert.assertEquals("2 4 S", rover.stateCurrentLocation());
    }

    @Test
    public void canTurnRight(){
        // Given
        Plateau plateau = new Plateau(5, 5);
        Coords startingLocation = new Coords(2, 4);
        Rover rover = new Rover(plateau, startingLocation, Direction.W);

        // When
        rover.turnRight();

        // Then
        Assert.assertEquals("2 4 N", rover.stateCurrentLocation());
    }

    @Test
    public void canMove() {
        // Given
        Plateau plateau = new Plateau(5, 5);
        Coords startingLocation = new Coords(1, 4);
        Rover rover = new Rover(plateau, startingLocation, Direction.E);

        // When
        rover.move();

        // Then
        Assert.assertEquals("2 4 E", rover.stateCurrentLocation());
    }

    @Test
    public void canRunTurnLeftCommand(){
        // Given
        Plateau plateau = new Plateau(5,5);
        Coords startingLocation = new Coords(3, 2);
        Rover rover = new Rover(plateau, startingLocation, Direction.S);

        // When
        rover.run("L");

        // Then
        Assert.assertEquals("3 2 E", rover.stateCurrentLocation());
    }


}