package btth.facade;

import btth.factory.AirCondition;
import btth.factory.Device;
import btth.factory.LightDevice;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeFacade {
    private List<Device> devices = new ArrayList<>();

    private void addDevice(Device device) {
        devices.add(device);
    }

    public void sleepMode() {
        for (Device device : devices) {
            if (device instanceof LightDevice) {
                device.turnOff();
            } else if ( device instanceof AirCondition){
                device.turnOn();
            }
        }
    }

    public void leaveHomeMode() {
        for (Device device : devices) {
            device.turnOff();
        }
    }


}
