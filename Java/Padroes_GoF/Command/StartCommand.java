package Padroes_GoF.Command;

public class StartCommand implements CommandInterface {

    private Vehicle vehicle;

    public StartCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.start();
    }

    @Override
    public void undo() {
        vehicle.stop();
    }

}
