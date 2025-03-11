package q2;

class Game {
    private IGameStrategy gameStrategy;

    // Constructor to set strategy
    public Game(IGameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    // Method to play the game using the assigned strategy
    public void play() {
        gameStrategy.initializeGame();
        gameStrategy.playingGame();
        gameStrategy.showResult();
    }
}
