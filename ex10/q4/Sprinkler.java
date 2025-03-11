public class Sprinkler extends Device {
    public Sprinkler() {
        super("Sprinkler");
    }

    public void activate() {
        System.out.println("I am sprinkler,... doing my task");
        mediator.sendEvent("Sprinkler Activated", this);
    }

    @Override
    public void receiveEvent(String event) {
        if (event.equals("Alarm Activated")) {
            activate();
        }
    }
}
