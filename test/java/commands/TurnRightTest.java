package commands;

import org.junit.Assert;
import org.junit.Test;
import rover.Rover;
import rover.commands.TurnRight;
import rover.environment.Coords;
import rover.environment.Direction;
import rover.environment.Plateau;

public class TurnRightTest {

    @Test
    public void roverCanTurnRight() {
        //Given
        TurnRight command = new TurnRight();
        Plateau plateau = new Plateau(5,5);
        Coords startingPosition = new Coords(4,3);
        Rover rover = new Rover(plateau, startingPosition, Direction.N);

        //When
        command.execute(rover);

        //Then
        Assert.assertEquals("4 3 E", rover.stateCurrentLocation());
    }
}
