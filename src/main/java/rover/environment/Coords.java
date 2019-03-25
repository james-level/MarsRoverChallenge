package rover.environment;

public class Coords {

    private int xCoord;
    private int yCoord;

    public Coords(final int xCoord, final int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;

    }

    @Override
    public String toString(){
        StringBuilder coordinateOutput = new StringBuilder();
        coordinateOutput.append(xCoord);
        coordinateOutput.append(" ");
        coordinateOutput.append(yCoord);
        return coordinateOutput.toString();
    }

    //   Adds new coordinates for rover
    public Coords newCoordsFor(final int xCoordsStepValue, final int yCoordsStepValue) {
        return new Coords(this.xCoord + xCoordsStepValue, this.yCoord + yCoordsStepValue);
    }


    //   Advises if coordinates is off plateau (i.e out-of-bounds)
    public boolean isOutOfBounds(final Coords coords ){
        return isXCoordOutOfBounds(coords.xCoord) && isYCoordOutOfBounds(coords.yCoord);
    }

    private boolean isXCoordOutOfBounds(int xCoord) {
        return xCoord >= this.xCoord;
    }

    private boolean isYCoordOutOfBounds(int yCoord) {
        return yCoord >= this.yCoord;
    }


    //   Advises if coordinates is on plateau (i.e within-bounds)
    public boolean isWithinBounds(final Coords coords ){
        return isXCoordWithinBounds(coords.xCoord) && isYCoordWithinBounds(coords.yCoord);
    }

    private boolean isXCoordWithinBounds(int xCoord) {
        return xCoord <= this.xCoord;
    }

    private boolean isYCoordWithinBounds(int yCoord) {
        return yCoord <= this.yCoord;
    }

}