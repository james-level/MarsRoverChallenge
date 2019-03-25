package commands;

import org.junit.Assert;
import org.junit.Test;
import rover.Rover;
import rover.commands.TurnLeft;
import rover.environment.Coords;
import rover.environment.Direction;
import rover.environment.Plateau;

public class TurnLeftTest {

    @Test
    public void turnLeftTest() {
        //Given
        TurnLeft command = new TurnLeft();
        Plateau plateau = new Plateau(5,5);
        Coords startingPosition = new Coords(3,3);
        Rover rover = new Rover(plateau, startingPosition, Direction.S);

        //When
        command.execute(rover);

        //Then
        Assert.assertEquals("3 3 E", rover.stateCurrentLocation());
    }
}
