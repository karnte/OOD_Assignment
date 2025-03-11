public class Alarm extends Device {
    public Alarm() {
        super("Alarm");
    }

    public void doAlarm() {
        System.out.println("Alarm is sending event to all...");
        mediator.sendEvent("Alarm Activated", this);
    }

    @Override
    public void receiveEvent(String event) {
        System.out.println("Alarm received event: " + event);
    }
}
