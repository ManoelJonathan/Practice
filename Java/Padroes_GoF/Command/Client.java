package Padroes_GoF.Command;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Sedan", "Toyota");
        CommandInterface startCommand = new StartCommand(vehicle);
        CommandInterface stopCommand = new StopCommand(vehicle);

        RemoteControl remoteControl = new RemoteControl();

        // Start the vehicle
        remoteControl.setCommand(startCommand);
        remoteControl.pressButton();

        // Stop the vehicle
        remoteControl.setCommand(stopCommand);
        remoteControl.pressButton();
        remoteControl.pressUndo();
    }
    
}
