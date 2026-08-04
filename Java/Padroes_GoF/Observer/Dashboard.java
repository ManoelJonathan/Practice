package Padroes_GoF.Observer;

public class Dashboard implements Observer {

    @Override
    public void update(int speed, int fuelLevel) {
        System.out.println("Dashboard: Atualizando dados do veículo... Speed: " + speed + ", Fuel Level: " + fuelLevel);
    }
}
