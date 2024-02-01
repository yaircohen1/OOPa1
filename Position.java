import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Position {
    private int x;
    private int y;
    private final List<Piece> diffPieces;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
        this.diffPieces = new ArrayList<>();
    }

    // Getter methods for x and y coordinates
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

public String toString() {
    return "("+this.x+","+this.y+")";
}
}