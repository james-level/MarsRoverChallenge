package environment;

import org.junit.Assert;
import org.junit.Test;
import rover.environment.Coords;
import rover.environment.Plateau;

public class PlateauTest {

    //  Tests is coordinates fall within plateau
    @Test
    public void areCoordsOnPlateau() {
        //Given
        Plateau plateau = new Plateau(5,5);

        //When
        Coords plateauCoords = new Coords(5, 0);

        //Then
        Assert.assertTrue(plateau.withinBoundary(plateauCoords));
    }


    //  Tests is coordinates fall outside plateau boundary (+'ve X-Coord)
    @Test
    public void isPositiveXCoordOutsideOfPlateauBoundary() {
        //Given
        Plateau plateau = new Plateau(5,5);

        //When
        Coords coords = new Coords(6, 0);

        //Then
        Assert.assertFalse(plateau.withinBoundary(coords));
    }

    //  Tests is coordinates fall outside plateau boundary (-'ve X-Coord)
    @Test
    public void isNegativeXCoordOutsideOfPlateauBoundary() {
        //Given
        Plateau plateau = new Plateau(5,5);

        //When
        Coords coordinates = new Coords(-1, 0);

        //Then
        Assert.assertFalse(plateau.withinBoundary(coordinates));
    }

    //  Tests is coordinates fall outside plateau boundary (+'ve Y-Coord)
    @Test
    public void isPositiveYCoordOutsideOfPlateauBoundary() {
        //Given
        Plateau plateau = new Plateau(5,5);

        //When
        Coords coordinates = new Coords(0, 6);


        //Then
        Assert.assertFalse(plateau.withinBoundary(coordinates));
    }

    //  Tests is coordinates fall outside plateau boundary (-'ve Y-Coord)
    @Test
    public void isNegativeYCoordOutsideOfPlateauBoundary() {
        //Given
        Plateau plateau = new Plateau(5,5);

        //When
        Coords coords = new Coords(0, -1);

        //Then
        Assert.assertFalse(plateau.withinBoundary(coords));
    }
}
