package btth.observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor {
    private List<Observer> receiver = new ArrayList<>();

    public void addObserver(Observer observer) {
        receiver.add(observer);
    }

    public void sendInfo(String info) {
        for (Observer observer : receiver) {
            observer.update(info);
        }
    }
}
