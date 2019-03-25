package rover.environment;

public class Plateau {

    private Coords upperRightCoords = new Coords(0, 0);
    private Coords lowerLeftCoords = new Coords(0, 0);


    // Defines max (upper left) plateau boundary
    public Plateau(final int upperRightXCoord, final int upperRightYCoord){
        this.upperRightCoords = this.upperRightCoords.newCoordsFor(upperRightXCoord, upperRightYCoord);

    }

    // Defines max (upper left) plateau boundary
    public boolean withinBoundary(final Coords coords){
        return this.lowerLeftCoords.isOutOfBounds(coords) && this.upperRightCoords.isWithinBounds(coords);
    }

}