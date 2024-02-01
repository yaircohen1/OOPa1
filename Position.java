import java.util.*;

public class Position {
    private int x;
    private int y;
    private List<Piece> pieces ;


    public Position(int x, int y) {
        this.x = x;
        this.y = y;
        this.pieces = new ArrayList<>();
    }

    // Getter methods for x and y coordinates
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    public List getPieces (){
        return this.pieces;
    }
    public void addPiece(Piece piece) {
        if (!this.pieces.contains(piece)) {
            this.pieces.add(piece);
        }
    }

    public int getPieceSize() {
        return this.pieces.size();
    }

    public String toString() {
        return "("+this.x+","+this.y+")";
    }
    public static Comparator<Position> positionsComparator = Comparator.comparingInt(Position::getPieceSize);
    static class positionsComparator implements Comparator<Position> {

        public int compare(Position position1, Position position2) {
            int x1 = position1.getX();
            int x2 = position2.getX();
            int y1 = position1.getY();
            int y2= position2.getY();
            if (position1.getPieceSize()==position2.getPieceSize()){
                if(x1==x2){
                    if(y1>y2){
                        return 1; // we want ascending order
                    }
                    else return -1;
                }
                else {
                    if (x1>x2){ // we want ascending order
                        return 1;
                    }
                    else return -1;
                }
            }
            else{
                if (position1.getPieceSize()>position2.getPieceSize()) { // we want a ascending order
                    return 1;
                }
                else return  -1;
            }
        }
    }

}