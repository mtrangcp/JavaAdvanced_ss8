package btth.factory;

public class FanDevice implements Device{
    @Override
    public void turnOn() {
        System.out.println("bat quat");
    }

    @Override
    public void turnOff() {
        System.out.println("Tat quat");
    }
}
