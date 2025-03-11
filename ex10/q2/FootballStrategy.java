package q2;
class FootballStrategy implements IGameStrategy {
    @Override
    public void initializeGame() {
        System.out.println("Initializing football game...");
    }

    @Override
    public void playingGame() {
        System.out.println("Playing football game...");
    }

    @Override
    public void showResult() {
        System.out.println("Showing the results for the football game...");
    }
}