package Padroes_GoF.FlyWeight;

public class Client {

    public static void main(String[] args){
        VehicleFactory factory = new VehicleFactory();

        VehicleFlyWeight car1 = factory.getModel("Sedan", "Chevrolet", "Preto",
        "v6", "Categoria A");

        VehicleFlyWeight car2 = factory.getModel("Coupe", "BMW", "Preto",
        "v8", "Categoria B");

        Vehicle firstVehicle = new Vehicle("ABC1234", "10000", "123456789", car1);
        Vehicle secondVehicle = new Vehicle("DEF5678", "20000", "987654321", car2);

        System.out.println("Primeiro veículo:");
        firstVehicle.start();

        System.out.println("\nSegundo veículo:");
        secondVehicle.start();

        System.out.println("\nParando os veículos:");
        firstVehicle.stop();
        secondVehicle.stop();
    }

    
}
