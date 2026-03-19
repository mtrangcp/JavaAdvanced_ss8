package btth.factory;

public class AirCondition implements Device{
    private int temperature = 18;

    public void setTemp(int temp){
        this.temperature = temp;
    }


    @Override
    public void turnOn() {
        System.out.println("bat dieu hoa: "+ temperature);
    }

    @Override
    public void turnOff() {
        System.out.println("tat dieu hoa");
    }

    public int getTemperature() {
        return temperature;
    }
}
