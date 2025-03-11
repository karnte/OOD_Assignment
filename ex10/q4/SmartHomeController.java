import java.util.ArrayList;
import java.util.List;

public class SmartHomeController implements SmartHomeMediator {
    private List<Device> devices = new ArrayList<>();

    public void registerDevice(Device device) {
        devices.add(device);
        device.setMediator(this);
    }

    @Override
    public void sendEvent(String event, Device sender) {
        System.out.println(sender.getName() + " triggered event: " + event);
        for (Device device : devices) {
            if (device != sender) {
                device.receiveEvent(event);
            }
        }
    }
}
