package Padroes_GoF.Chain_of_Responsability;

public class BasicMechanic implements MaintenanceHandler {
    private MaintenanceHandler nextMaintenanceHandler;

    @Override
    public void setNext(MaintenanceHandler handler) {
        this.nextMaintenanceHandler = handler;
    }

    @Override
    public void handle(MaintenanceRequest request) {
        if (request.getLevel() == 1) {
            System.out.println("Basic Mechanic is handling: " + request.getDescription());
        } else if (nextMaintenanceHandler != null) {
            nextMaintenanceHandler.handle(request);
        } else {
            System.out.println("No handler available for the maintenance request.");
        }
    }
}