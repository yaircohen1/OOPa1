public class ConcretePlayer implements Player {
    private boolean isPlayerOne;
    private int wins;

    public ConcretePlayer(boolean isPlayerOne) {
        this.isPlayerOne = isPlayerOne;
        this.wins = 0;
    }
    //  if isPlayerOne is true so the player is defender, else attacker
    public boolean isPlayerOne() {
        return isPlayerOne;
    }

    public int getWins() {
        return wins;
    }

    // Method to increment the number of wins
    public void winGame() {
        this.wins++;
    }

}
