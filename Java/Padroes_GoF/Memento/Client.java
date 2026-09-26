package Padroes_GoF.Memento;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.setModel("Sport");
        vehicle.setVelocidade(300);

        HistoryMemento history = new HistoryMemento();
        history.save(vehicle.save());

        vehicle.setModel("Eco");
        vehicle.setVelocidade(100);

        vehicle.restore(history.undo());

        System.out.println("Modelo: " + vehicle.getModel());
        System.out.println("Velocidade: " + vehicle.getVelocidade());
    }
    
}
