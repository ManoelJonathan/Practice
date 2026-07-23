package Padroes_GoF.AbstractFactory.ConcreteProducts;

import Padroes_GoF.AbstractFactory.AbstractProducts.AbstractWheel;

public class SportWheel  extends AbstractWheel {
    String aro;
    String material;

    public SportWheel(String aro, String material) {
        this.aro = aro;
        this.material = material;
    }

    @Override
    public void andar() {
        System.out.println("Andando com a roda Sport de aro " + aro + " e material " + material);
    }
    
}
