import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class ConcretePiece implements Piece {
    protected Player owner;
    private List<Position> moveHistory = new ArrayList<>();
    protected int numConcretePiece;
    private Position position;
    private int distance;

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

    public Position getPosition() {
        return this.position;
    }

    public List<Position> getMoveHistory() {
        return this.moveHistory;
    }

    public int getMoveHistorySize() {
        return this.moveHistory.size();
    }
    public int calDistance() {
        int distance = 0;
        for (int i = 0; i < moveHistory.size() - 1; i++) {
            int x1 = this.moveHistory.get(i).getX();
            int y1 = this.moveHistory.get(i).getY();
            int x2 = this.moveHistory.get(i + 1).getX();
            int y2 = this.moveHistory.get(i + 1).getY();
            int squaredDistance = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
            distance += Math.sqrt(squaredDistance);
        }
        return this.distance=distance;
    }

    public static Comparator<ConcretePiece> MoveHistorySizeComparator = Comparator.comparingInt(ConcretePiece::getMoveHistorySize);
    public static Comparator<ConcretePiece> distanceComparator = Comparator.comparingInt(ConcretePiece::calDistance);

    static class MoveHistorySizeComparator implements Comparator<ConcretePiece> {
        public int compare(ConcretePiece piece1, ConcretePiece piece2) {
            return Integer.compare(piece1.getMoveHistorySize(), piece2.getMoveHistorySize());
        }
    }

    static class distanceComparator implements Comparator<ConcretePiece> {
     private  ConcretePlayer player;
        public distanceComparator(ConcretePlayer player){
            this.player=player;
        }
        public int compare(ConcretePiece piece1, ConcretePiece piece2) {
            int num1 = piece1.getNumConcretePiece();
            int num2 = piece2.getNumConcretePiece();
            if (piece1.calDistance()==piece2.calDistance()){
                if(num1==num2){
                    if(piece1.getOwner()!=player){
                        return 1; // we want winner first
                    }
                    else return -1;
                }
                else {
                    if (num1>num2){ // we want ascending order
                        return 1;
                    }
                    else return -1;
                }
            }
            else{
                if (piece1.calDistance()<piece2.calDistance()) { // we want a descending order
                    return 1;
                }
                else return  -1;
            }
        }
    }
}