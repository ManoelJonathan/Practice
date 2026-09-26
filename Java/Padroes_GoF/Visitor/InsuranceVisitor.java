package Padroes_GoF.Visitor;

public class InsuranceVisitor implements Visitor {

    public void visit(Car car) {
        System.out.println("Calculating insurance for Car: " + car.getPlaca());
        // Implement insurance calculation logic for Car
    }



    public void visit(Motorcycle motorcycle) {
        System.out.println("Calculating insurance for Motorcycle: " + motorcycle.getPlaca());
        // Implement insurance calculation logic for Motorcycle
    }

    public void visit(Truck truck) {
        System.out.println("Calculating insurance for Truck: " + truck.getPlaca());
        // Implement insurance calculation logic for Truck
    }

}