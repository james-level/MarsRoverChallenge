package thoughtworks;

import org.junit.Assert;
import org.junit.Test;
import rover.Rover;
import rover.environment.Coords;
import rover.environment.Direction;
import rover.environment.Plateau;


public class CodeTestTest {

    //  Tests if rover's current location can be returned as a string
    @Test
    public void codeTestCanPass() {
        //Given
        Plateau plateau = new Plateau(5, 5);
        Coords startingPosition = new Coords(1, 2);
        Coords startingPosition2 = new Coords(3, 3);
        Rover rover1 = new Rover(plateau, startingPosition, Direction.N);
        Rover rover2 = new Rover(plateau, startingPosition2, Direction.E);

        //When
        rover1.run("LMLMLMLMM");

        rover2.run("MMRMMRMRRM");

        // Then
        Assert.assertEquals("1 3 N", rover1.stateCurrentLocation());
        Assert.assertEquals("5 1 E", rover2.stateCurrentLocation());

    }

}