package Padroes_GoF.Memento;

public class Vehicle {
    private String model;
    private int velocidade;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }


    public VehicleMemento save() {
        return new VehicleMemento(model, velocidade);
    }

    public void restore(VehicleMemento memento) {
        this.model = memento.getModel();
        this.velocidade = memento.getVelocidade();
    }
}