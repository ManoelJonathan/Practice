package Padroes_GoF.FlyWeitgh;

public class Vehicle {
    private String placa;
    private String quilometragem;
    private String numeroChassi;
    private VehicleFlyWeight vehicleFlyWeight;

    public Vehicle(String placa, String quilometragem, String numeroChassi, VehicleFlyWeight vehicleFlyWeight) {
        this.placa = placa;
        this.quilometragem = quilometragem;
        this.numeroChassi = numeroChassi;
        this.vehicleFlyWeight = vehicleFlyWeight;
    }

    public void start() {
        vehicleFlyWeight.start(this.placa, this.quilometragem, this.numeroChassi);
    }

    public void stop() {
        vehicleFlyWeight.stop();
    }
    
}
