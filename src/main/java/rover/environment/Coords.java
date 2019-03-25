package rover.environment;

public class Coords {

    private int xCoord;
    private int yCoord;

    public Coords(final int xCoord, final int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;

    }

    public Coords newCoordsFor(final int xCoordsStepValue, final int yCoordsStepValue) {
        return new Coords(this.xCoord + xCoordsStepValue, this.yCoord + yCoordsStepValue);
    }


}
