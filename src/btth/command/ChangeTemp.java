package btth.command;

import btth.factory.AirCondition;

public class ChangeTemp implements Command{
    private AirCondition device;

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }

    public void increment(){
        device.setTemp(device.getTemperature() + 1);
    }
    public void decrement(){
        device.setTemp(device.getTemperature() - 1);
    }


}
