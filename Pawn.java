import java.util.Comparator;

public class Pawn extends ConcretePiece {
    private int kill;

    // Constructor
    public Pawn(Player owner) {
        this.owner = owner;
        this.kill = 0;
    }

    public void kill() {
        this.kill = this.kill + 1;
    }

    public int getKills() {
        return this.kill;
    }

    public String getType() {
        if (this.getOwner().isPlayerOne()) {
            return "♙";
        } else {
            return "♟";
        }
    }

    public String toString() {
        String temp = this.getOwner().isPlayerOne() ? "D" : "A";
        return temp + this.numConcretePiece + ": ";
    }

    public static Comparator<Pawn> killsComparator = Comparator.comparingInt(Pawn::getKills);


    static class KillsComparator implements Comparator<Pawn> {
        final ConcretePlayer player;
        public KillsComparator(ConcretePlayer player){
            this.player=player;
        }
        public int compare(Pawn pawn1, Pawn pawn2) {
            int num1 = pawn1.getNumConcretePiece();
            int num2 = pawn2.getNumConcretePiece();
            if (pawn1.getKills()==pawn2.getKills()){
                if(num1==num2){
                    if(pawn1.getOwner()!=player){
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
                if (pawn1.getKills()<pawn2.getKills()) { // we want a descending order
                return 1;
                }
                else return  -1;
            }
        }
    }
}







