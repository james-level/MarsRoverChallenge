package rover.environment;

public class Plateau {

    private Coords upperRightCoords = new Coords(0, 0);
    private Coords lowerLeftCoords = new Coords(0, 0);

    public Plateau(final int upperRightXCoord, final int upperRightYCoord){
        this.upperRightCoords = this.upperRightCoords.newCoordsFor(upperRightXCoord, upperRightYCoord);

    }

    public boolean withinBoundary(final Coords coords){
        return this.lowerLeftCoords.
    }

}
