package Padroes_GoF.Observer;

import java.util.List;

public class VehicleTelemetry {

    private int speed;
    private int fuelLevel;
    
    private final List<Observer> observers = new java.util.ArrayList<>();

    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void setTelemetry(int speed, int fuelLevel) {
        this.speed = speed;
        this.fuelLevel = fuelLevel;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(speed, fuelLevel);
        }
    }

}
