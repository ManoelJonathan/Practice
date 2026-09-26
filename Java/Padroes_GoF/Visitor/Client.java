package Padroes_GoF.Visitor;

public class Client {
    public static void main(String[] args) {
        Vehicle car = new Car("ABC1234", "10000", "123456789");
        Vehicle motorcycle = new Motorcycle("XYZ5678", "5000", "987654321");
        Vehicle truck = new Truck("DEF4321", "20000", "111111111");

        Visitor visitor = new MaintenanceVisitor();

        car.accept(visitor);
        motorcycle.accept(visitor);
        truck.accept(visitor);

        System.out.println();

        visitor = new InsuranceVisitor();
        car.accept(visitor);
        motorcycle.accept(visitor);
        truck.accept(visitor);
    }
    
}
