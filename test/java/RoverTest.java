
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


}