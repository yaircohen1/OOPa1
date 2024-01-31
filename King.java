public class King extends ConcretePiece{

    // Constructor
    public King(Player owner) {
        this.owner = owner;

    }
    // Methods
    public String getType() {
        return "♚";
    }

    public String toString() {
        return "K" + this.numConcretePiece + ": ";
    }
}
