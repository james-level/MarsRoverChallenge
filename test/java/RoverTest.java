
import org.junit.Assert;
import org.junit.Test;
import rover.Rover;
import rover.environment.Coords;
import rover.environment.Direction;
import rover.environment.Plateau;


public class RoverTest {

    //  Tests if rover's current location can be returned as a string
    @Test
    public void statesCurrentLocationAsString() {
        // Given
        Plateau plateau = new Plateau(5, 5);
        Coords startingLocation = new Coords(2, 5);

        // When
        Rover rover = new Rover(plateau, startingLocation, Direction.N);

        // Then
        Assert.assertEquals("2 5 N", rover.stateCurrentLocation());

    }

    // Tests if rover turns left from starting orientation
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

    // Tests if rover turns right from starting orientation
    @Test
    public void canTurnRight() {
        // Given
        Plateau plateau = new Plateau(5, 5);
        Coords startingLocation = new Coords(2, 4);
        Rover rover = new Rover(plateau, startingLocation, Direction.W);

        // When
        rover.turnRight();

        // Then
        Assert.assertEquals("2 4 N", rover.stateCurrentLocation());
    }

    // Tests if rover moves by one unit along current orientation
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

    // Tests command passed via CommandListBuilder is accepted
    @Test
    public void canRunTurnLeftCommand() {
        // Given
        Plateau plateau = new Plateau(5, 5);
        Coords startingLocation = new Coords(3, 2);
        Rover rover = new Rover(plateau, startingLocation, Direction.S);

        // When
        rover.run("L");

        // Then
        Assert.assertEquals("3 2 E", rover.stateCurrentLocation());
    }

    // Tests command passed via CommandListBuilder is accepted
    @Test
    public void canRunTurnRightCommand() {
        // Given
        Plateau plateau = new Plateau(5, 5);
        Coords startingLocation = new Coords(3, 2);
        Rover rover = new Rover(plateau, startingLocation, Direction.S);

        // When
        rover.run("R");

        // Then
        Assert.assertEquals("3 2 W", rover.stateCurrentLocation());
    }

    // Tests command passed via CommandListBuilder is accepted
    @Test
    public void canRunCommandToMove() {
        // Given
        Plateau plateau = new Plateau(5, 5);
        Coords startingLocation = new Coords(3, 3);
        Rover rover = new Rover(plateau, startingLocation, Direction.W);

        // When
        rover.run("M");

        // Then
        Assert.assertEquals("2 3 W", rover.stateCurrentLocation());
    }

    // Tests rover can accept multiple commands issued at once in string form
    @Test
    public void canRunMultiInstructionCommand() {
        //Given
        Plateau plateau = new Plateau(5, 5);
        Coords startingPosition = new Coords(3, 3);
        Rover rover = new Rover(plateau, startingPosition, Direction.E);

        //When
        rover.run("MMRMMRMRRM");

        // Then
        Assert.assertEquals("5 1 E", rover.stateCurrentLocation());
    }

    // Tests rover with input that would take it off plateau. Expected result should show that rover is on outer edge of plateau (i.e.
    // it cannot go further than the plateau edge)
    @Test
    public void restrictedToPlateau(){
        // Given
        Plateau plateau = new Plateau(5, 5);
        Coords startingPosition = new Coords(4, 4);
        Rover rover = new Rover(plateau, startingPosition, Direction.E);

        // When
        rover.run("MM");

        // Then
        Assert.assertEquals("5 4 E", rover.stateCurrentLocation());
    }
}