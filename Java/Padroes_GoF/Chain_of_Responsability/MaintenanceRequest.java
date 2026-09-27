package Padroes_GoF.Chain_of_Responsability;

public class MaintenanceRequest {
    private String description;
    private int level;
    private Vehicle vehicle;

    public MaintenanceRequest(String description, int level, Vehicle vehicle) {
        this.description = description;
        this.level = level;
        this.vehicle = vehicle;
    }

    public String getDescription() {
        return description;
    }

    public int getLevel() {
        return level;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

}