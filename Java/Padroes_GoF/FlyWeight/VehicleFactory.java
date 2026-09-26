package Padroes_GoF.FlyWeight;

import java.util.ArrayList;

public class VehicleFactory {
    private ArrayList<VehicleFlyWeight> vehicles;

    public VehicleFactory() {
        this.vehicles = new ArrayList<>();
    }

    public VehicleFlyWeight getModel(String modelo, String marca, String cor, String tipoMotor, String categoria) {
        for (int i = 0; i < vehicles.size(); i++) {
            VehicleFlyWeight vehicle = vehicles.get(i);
            if (vehicle instanceof CarModel) {
                CarModel carModel = (CarModel) vehicle;
                if (carModel.getModelo().equals(modelo) && carModel.getMarca().equals(marca) &&
                    carModel.getCor().equals(cor) && carModel.getTipoMotor().equals(tipoMotor) &&
                    carModel.getCategoria().equals(categoria)) {
                    return vehicle;
                }
            }
        }

        VehicleFlyWeight newVehicle = new CarModel(modelo, marca, cor, tipoMotor, categoria);
        vehicles.add(newVehicle);
        return newVehicle;
    }
    
}
