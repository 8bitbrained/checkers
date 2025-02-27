package am.aua.checkers.core;
/**
 * @author Gor Hovakimyan
* References Martin Palanjyan's HW09
 */

public abstract class Piece implements Cloneable {
    private Checkers.PieceColor color;

    public Piece(Checkers.PieceColor color) {
        this.color = color;
    }

    public Piece() {
        this(Checkers.PieceColor.WHITE);
    }

    /**
     * An abstract method
     *
     * @param Checkers
     * @param p
     * @return
     */

    public abstract Position[] allDestinations(Checkers Checkers, Position p);

    /**
     * An accessor for the color that cannot be overriden.
     *
     * @return
     */

    public final Checkers.PieceColor getPieceColor() {
        return this.color;
    }


    public Piece clone() {
        try {
            Piece copy = (Piece) super.clone();
            copy.color = color;
            return copy;
        } catch (CloneNotSupportedException e) {
            return null;
        }


    }

    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            Piece otherPiece = (Piece) otherObject;
            return (this.color.equals(otherPiece.getPieceColor()));
        }


    }
}
