package Padroes_GoF.FlyWeight;

public interface VehicleFlyWeight {
    public void start(String placa, String quilometragem, String numeroChassi);
    public void stop();
}