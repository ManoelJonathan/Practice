package Padroes_GoF.Chain_of_Responsability;

public class Client {
    public static void main(String[] args) {
        MaintenanceHandler basic = new BasicMechanic();
        MaintenanceHandler intermediate = new SpecialMechanic();
        MaintenanceHandler advanced = new SeniorMechanic();

        basic.setNext(intermediate);
        intermediate.setNext(advanced);

        Vehicle vehicle = new Vehicle("Carro", "ABC-1234");
        MaintenanceRequest basicRequest = new MaintenanceRequest("Troca de óleo", 1, vehicle);
        MaintenanceRequest specialRequest = new MaintenanceRequest("Troca de pastilhas", 2, vehicle);
        MaintenanceRequest seniorRequest = new MaintenanceRequest("Reparo no motor", 3, vehicle);

        basic.handle(basicRequest);
        basic.handle(specialRequest);
        basic.handle(seniorRequest);
    }
}