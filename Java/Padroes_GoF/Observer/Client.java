package Padroes_GoF.Observer;

public class Client {
    public static void main(String[] args) {
        VehicleTelemetry vehicleTelemetry = new VehicleTelemetry();
        LoggerObserver loggerObserver = new LoggerObserver();
        Maintenance maintenance = new Maintenance();
        Dashboard dashBoard = new Dashboard();
    


        vehicleTelemetry.registerObserver(loggerObserver);
        vehicleTelemetry.registerObserver(maintenance);
        vehicleTelemetry.registerObserver(dashBoard);
        
        vehicleTelemetry.setTelemetry(100, 80);

    }
}
