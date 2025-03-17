public class ScoreSubject {
    private String score;
    private java.util.ArrayList<ScoreObserver> observers = new java.util.ArrayList<>();
    
    public void registerObserver(ScoreObserver observer) {
        observers.add(observer);
    }
    
    public void removeObserver(ScoreObserver observer) {
        observers.remove(observer);
    }
    
    public void notifyObservers() {
        for (ScoreObserver observer : observers) {
            observer.update(score);
        }
    }
    
    public void setScore(String score) {
        this.score = score;
        notifyObservers();
    }
}
