class ScoreReporter implements ScoreObserver {
    private String name;
    
    public ScoreReporter(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String score) {
        System.out.println("live result: " + score + " <- " + name);
    }
}