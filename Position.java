import java.util.LinkedList;
import java.util.List;

public class Position {
    private int x;
    private int y;
    private final List<Piece> pieces;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
        this.pieces = new LinkedList();
    }

    // Getter methods for x and y coordinates
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void raisePiece(Piece piece) {
        this.pieces.add(piece);
    }

public String toString() {
    return "("+this.x+","+this.y+")";
}
}