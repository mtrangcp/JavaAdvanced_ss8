package btth.command;

import btth.factory.Device;

public class TurnOnCommand implements Command {
    private Device device;

    public void setDevice(Device device) {
        this.device = device;
    }


    @Override
    public void execute() {
        device.turnOn();
    }

    @Override
    public void undo() {
        device.turnOff();
    }

    @Override
    public void redo() {
        device.turnOff();
    }
}
