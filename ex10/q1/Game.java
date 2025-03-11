package q1;
// Abstract class defining the template method
public abstract class Game {
    public final void play() {
        initializeGame();
        playingGame();
        showResult();
    }

    protected abstract void initializeGame();
    protected abstract void playingGame();
    protected abstract void showResult();
} 

