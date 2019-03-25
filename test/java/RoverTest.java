import com.sun.prism.image.Coords;
import org.junit.Assert;
import org.junit.Test;
import rover.environment.Plateau;


public class RoverTest {


    @Test
    public void statesCurrentLocationAsString() {
        // Given
        Plateau plateau = new Plateau(5,5);
        Coords startingLocation = new Coords(2, 5);

        // When
        Rover rover = new Rover(plateau, Direction.N, startingLocation);

        // Then
        Assert.assertEquals("2 5 N", rover.stateCurrentLocation());

    }


}