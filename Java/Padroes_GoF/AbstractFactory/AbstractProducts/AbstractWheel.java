package Padroes_GoF.AbstractFactory.AbstractProducts;

public abstract class AbstractWheel {
    String aro;
    String material;

    public void andar() {
        System.out.println("Andando com a roda de aro " + aro + " e material " + material);
    }
}
