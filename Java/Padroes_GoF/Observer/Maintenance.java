package Padroes_GoF.Observer;

public class Maintenance implements Observer {
 
    @Override
    public void update(int speed, int fuelLevel) {
        System.out.println("Maintenance: Atualizando dados do veículo... Speed: " + speed + ", Fuel Level: " + fuelLevel);
    }
    
}
