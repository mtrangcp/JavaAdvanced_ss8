package btth.observer;

public class FanObserver implements Observer {
    @Override
    public void update(String info) {
        System.out.println("quat nhan info tu cam bien:"+ info);
    }
}
