package Padroes_GoF.Memento;
public class VehicleMemento {
    private String model;
    private int velociadade;

    public VehicleMemento(String model, int velociadade) {
        this.model = model;
        this.velociadade = velociadade;
    }

    public String getModel() {
        return model;
    }

    public int getVelocidade() {
        return velociadade;
    }
}