public class CoffeePot extends Device {
    public CoffeePot() {
        super("Coffee Pot");
    }

    public void activate() {
        System.out.println("I am coffee pot,... doing my task");
        mediator.sendEvent("Coffee Pot Activated", this);
    }

    @Override
    public void receiveEvent(String event) {
        if (event.equals("Alarm Activated")) {
            activate();
        }
    }
}
