public class Manager implements IManager, ICEOAndManager{
    @Override
    public void hire() {
        System.out.println("Hiring...");
    }

    @Override
    public void train() {
        System.out.println("Training...");
    }

    @Override
    public void addBonus() {
        System.out.println("Adding bonus at the end of the year...");
    }

    @Override
    public void salary() {
    }
}