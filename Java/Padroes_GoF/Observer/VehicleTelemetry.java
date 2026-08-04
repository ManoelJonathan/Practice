package Padroes_GoF.Observer;

import java.util.List;

public class VehicleTelemetry {
    
    private final List<Observer> observers = new java.util.ArrayList<>();

    public void registerObserver(Observer subject) {
        this.observers.add(subject);
    }

    public void removeObserver(Observer subject) {
        this.observers.remove(subject);
    }

    public void setTelemetry(int speed, int fuelLevel) {
        for (Observer s : observers) {
            s.update(speed, fuelLevel);
        }
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(0, 0);
        }
    }

}
