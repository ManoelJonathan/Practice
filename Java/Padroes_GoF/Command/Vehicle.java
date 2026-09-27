package Padroes_GoF.Command;

public class Vehicle {

    private String model;
    private String name;

    public Vehicle(String model, String name) {
        this.model = model;
        this.name = name;
    }

    public void start() {
        System.out.println("Vehicle " + name + " of model " + model + " is starting.");
    }

    public void stop() {
        System.out.println("Vehicle " + name + " of model " + model + " is stopping.");
    }
    
}
