package environment;

import org.junit.Assert;
import org.junit.Test;
import rover.environment.Coords;

public class CoordsTest {


    //
    @Test
    public void xCoordIncrementsWithPostiveValue() {
        //Given
        Coords boundaryCoords = new Coords(4,5);

        //When
        boundaryCoords = boundaryCoords.newCoordsFor(1, 0);

        //Then
        Assert.assertEquals("5 5", boundaryCoords.toString());
    }

    @Test
    public void xCoordDecrementsWithNegativeValue() {
        //Given
        Coords boundaryCoords = new Coords(3,3);

        //When
        boundaryCoords = boundaryCoords.newCoordsFor(-2, 0);

        //Then
        Assert.assertEquals("1 3", boundaryCoords.toString());
    }

    @Test
    public void yCoordIncrementsWithPostiveValue() {
        //Given
        Coords boundaryCoords = new Coords(4,4);

        //When
        boundaryCoords = boundaryCoords.newCoordsFor(1, 1);

        //Then
        Assert.assertEquals("5 5", boundaryCoords.toString());
    }

    @Test
    public void yCoordDecrementsWithNegativeValue() {
        //Given
        Coords boundaryCoords = new Coords(2,3);

        //When
        boundaryCoords = boundaryCoords.newCoordsFor(0, -1);

        //Then
        Assert.assertEquals("2 2", boundaryCoords.toString());
    }

    @Test
    public void isCoordWithinBoundary() {
        //Given
        Coords boundaryCoords = new Coords(5,5);

        //When
        Coords internalPoint = new Coords(3,1);

        //Then
        Assert.assertTrue(boundaryCoords.isWithinBounds(internalPoint));
    }


    @Test
    public void isYCoordWithinBoundary() {
        //Given
        Coords boundaryCoords = new Coords(5,5);

        //When
        Coords internalPoint = new Coords(1,1);

        //Then
        Assert.assertTrue(boundaryCoords.isWithinBounds(internalPoint));
    }


    @Test
    public void isXCoordOutsideBoundary() {
        //Given
        Coords boundaryCoords = new Coords(5,5);

        //When
        Coords externalPoint = new Coords(8,5);

        //Then
        Assert.assertTrue(boundaryCoords.isOutOfBounds(externalPoint));
    }


    @Test
    public void isYCoordOutsideBoundary() {
        //Given
        Coords boundaryCoords = new Coords(5,5);

        //When
        Coords externalPoint = new Coords(5,8);

        //Then
        Assert.assertTrue(boundaryCoords.isOutOfBounds(externalPoint));
    }

}