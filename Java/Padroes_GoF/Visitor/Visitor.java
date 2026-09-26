package Padroes_GoF.Visitor;

public interface Visitor {
    void visit(Car car);
    void visit(Motorcycle motorcycle);
    void visit(Truck truck);
}
