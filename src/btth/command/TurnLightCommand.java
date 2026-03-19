package btth.command;

import btth.factory.Device;

public class TurnLightCommand implements Command {
    private Device device;

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }

    @Override
    public void undo() {
        device.turnOn();
    }

    @Override
    public void redo() {
        device.turnOn();
    }
}
