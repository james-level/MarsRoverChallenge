package environment;
import org.junit.Assert;
import org.junit.Test;
import rover.environment.Direction;

public class DirectionTest {


    @Test
    public void eastIsRightOfNorth() {
        //Given
        Direction north = Direction.N;

        //When
        Direction east = north.right();

        //Then
        Assert.assertEquals(Direction.E, east);
    }

    @Test
    public void westIsLeftOfNorth() {
        //Given
        Direction north = Direction.N;

        //When
        Direction west = north.left();

        //Then
        Assert.assertEquals(Direction.W, west);
    }


    @Test
    public void southIsLeftOfWest() {
        //Given
        Direction west = Direction.W;

        //When
        Direction south = west.left();

        //Then
        Assert.assertEquals(Direction.S, south);
    }

    @Test
    public void northIsRightOfWest() {
        //Given
        Direction west = Direction.W;

        //When
        Direction north = west.right();

        //Then
        Assert.assertEquals(Direction.N, north);
    }


    @Test
    public void eastIsLeftOfSouth() {
        //Given
        Direction south = Direction.S;

        //When
        Direction east = south.left();

        //Then
        Assert.assertEquals(Direction.E, east);
    }

    @Test
    public void northIsLeftOfEast() {
        //Given
        Direction east = Direction.E;

        //When
        Direction north = east.left();

        //Then
        Assert.assertEquals(Direction.N, north);
    }

    @Test
    public void westIsRightOfSouth() {
        //Given
        Direction south = Direction.S;

        //When
        Direction west = south.right();

        //Then
        Assert.assertEquals(Direction.W, west);
    }

    @Test
    public void southIsRightOfEast() {
        //Given
        Direction east = Direction.E;

        //When
        Direction south = east.right();

        //Then
        Assert.assertEquals(Direction.S, south);
    }

    @Test
    public void eastIsOneStepForwardOnXAxis() {
        //Given
        Direction east = Direction.E;

        //When
        int stepSize = east.movementForXAxis();

        //Then
        Assert.assertEquals(1, stepSize);
    }

    @Test
    public void westIsOneStepBackOnXAxis() {
        //Given
        Direction west = Direction.W;

        //When
        int stepSize = west.movementForXAxis();

        //Then
        Assert.assertEquals(-1, stepSize);
    }

    @Test
    public void eastIsStationaryOnYAxis() {
        //Given
        Direction east = Direction.E;

        //When
        int stepSize = east.movementForYAxis();

        //Then
        Assert.assertEquals(0, stepSize);
    }


    @Test
    public void westIsStationaryOnYAxis() {
        //Given
        Direction west = Direction.W;

        //When
        int stepSize = west.movementForYAxis();

        //Then
        Assert.assertEquals(0, stepSize);
    }

    @Test
    public void northIsOneStepForwardOnYAxis() {
        //Given
        Direction north = Direction.N;

        //When
        int stepSize = north.movementForYAxis();

        //Then
        Assert.assertEquals(1, stepSize);
    }


    @Test
    public void northIsStationaryOnXAxis() {
        //Given
        Direction north = Direction.N;

        //When
        int stepSize = north.movementForXAxis();

        //Then
        Assert.assertEquals(0, stepSize);
    }

    @Test
    public void southIsStationaryOnXAxis() {
        //Given
        Direction south = Direction.S;

        //When
        int stepSize = south.movementForXAxis();

        //Then
        Assert.assertEquals(0, stepSize);
    }

    @Test
    public void southIsOneStepBackOnYAxis() {
        //Given
        Direction south = Direction.S;

        //When
        int stepSize = south.movementForYAxis();

        //Then
        Assert.assertEquals(-1, stepSize);
    }


}