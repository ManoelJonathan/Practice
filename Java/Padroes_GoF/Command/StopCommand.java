package Padroes_GoF.Command;

public class StopCommand implements CommandInterface {

    private Vehicle vehicle;

    public StopCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.stop();
    }

    @Override
    public void undo() {
        vehicle.start();
    }
    
}
