package Padroes_GoF.Visitor;

public class MaintenanceVisitor implements Visitor {

    @Override 
    public  void visit(Car car) {
        System.out.println("Manutenção do carro: " + car.getPlaca());
        System.out.println("Quilometragem: " + car.getQuilometragem());
        System.out.println("Número do chassi: " + car.getNumeroChassi());
    }

    @Override 
    public void visit(Motorcycle motorcycle) {
        System.out.println("Manutenção da motocicleta: " + motorcycle.getPlaca());
        System.out.println("Quilometragem: " + motorcycle.getQuilometragem());
        System.out.println("Número do chassi: " + motorcycle.getNumeroChassi());
    }

    @Override 
    public void visit(Truck truck) {
        System.out.println("Manutenção do caminhão: " + truck.getPlaca());
        System.out.println("Quilometragem: " + truck.getQuilometragem());
        System.out.println("Número do chassi: " + truck.getNumeroChassi());
    }
    
}
