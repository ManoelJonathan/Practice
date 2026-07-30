package Padroes_GoF.Façade;

public class Client {
    public static void main(String[] args){
        CarFacade carFacade = new CarFacade();
        
        System.out.println("Starting the car...");
        carFacade.startCar();
        System.out.println("");

        System.out.println("Accelerating the car...");
        carFacade.accelerate();
        System.out.println("");

        System.out.println("Stopping the car...");
        carFacade.stopCar();

    }


}
