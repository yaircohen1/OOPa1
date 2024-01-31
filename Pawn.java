public class Pawn extends ConcretePiece{
    private int kill;

    // Constructor
    public Pawn(Player owner) {
        this.owner = owner;
        this.kill = 0;
    }

    public void kill() {
        this.kill=this.kill+1;
    }

    public void reduceKill() {
        this.kill=this.kill-1;
    }

    public int getKills() {
        return this.kill;
    }

    public String getKillsStr() {
        return this.kill + " kills";
    }

    public String getType() {
        if(this.getOwner().isPlayerOne())
        {
            return "♙";
        }
        else
        {
            return "♟";
        }
    }

    public String toString() {
        String temp = this.getOwner().isPlayerOne() ? "D" : "A";
        return temp + this.numConcretePiece + ": ";
    }
}





