package Padroes_GoF.Observer;

public class LoggerObserver implements Observer {
 
    @Override
    public void update(int speed, int fuelLevel) {
        System.out.println("LoggerObserver: Atualizando dados do veículo... Speed: " + speed + ", Fuel Level: " + fuelLevel);
    }

}
