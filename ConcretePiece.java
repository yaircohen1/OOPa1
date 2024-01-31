import java.util.ArrayList;
import java.util.List;

public abstract class ConcretePiece implements Piece {
    protected Player owner;
    private List <Position> moveHistory = new ArrayList<>();
    protected int numConcretePiece;
    private Position position;
    // Constructor
    public ConcretePiece() {
    }
    public Player getOwner() {
        return this.owner;
    }
    public abstract String getType();

    public abstract String toString();
    public int getNumConcretePiece() {
        return this.numConcretePiece;
    }
    public void setNumConcretePiece(int numConcretePiece) {
        this.numConcretePiece = numConcretePiece;
    }
    public void setPosition(Position position) {
            this.moveHistory.add(position);
            this.position = position;
        }

    public Position getPosition (){
        return this.position;
    }

    public List<Position> getMoveHistory() {
        return this.moveHistory;
    }

}
