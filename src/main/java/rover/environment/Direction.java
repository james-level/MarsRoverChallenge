package rover.environment;

public enum Direction {

    //  Defines Direction 'rover' moves along xy axis.
    //  EG: Terms in brackets correspond to amount of movement along respective axis
    //  Override changes 'directions' depending on current orientation


    //  North=(0,1),
    N(0,1) {
        @Override
        public Direction left() {
            return W;
        }

        @Override
        public Direction right() {
            return E;
        }
    },

    //  South=(0,-1)
    S(0,-1) {
        @Override
        public Direction right() {
            return W;
        }

        @Override
        public Direction left() {
            return E;
        }
    },

    //  East=(1,0)
    E(1,0) {
        @Override
        public Direction right() {
            return S;
        }

        @Override
        public Direction left() {
            return N;
        }
    },

    //  West=(-1,0)
    W(-1,0) {
        @Override
        public Direction right() {
            return N;
        }

        @Override
        public Direction left() {
            return S;
        }
    };


    private final int movementOnXAxis;
    private final int movementOnYAxis;

    Direction(final int movementOnXAxis, final int movementOnYAxis) {
        this.movementOnXAxis = movementOnXAxis;
        this.movementOnYAxis = movementOnYAxis;
    }

    public abstract Direction right();
    public abstract Direction left();

    public int movementForXAxis() {
        return this.movementOnXAxis;
    }

    public int movementForYAxis() {
        return this.movementOnYAxis;
    }

}