package Padroes_GoF.Chain_of_Responsability;

public interface MaintenanceHandler {
    public void setNext(MaintenanceHandler handler);
    public void handle(MaintenanceRequest request);
}
