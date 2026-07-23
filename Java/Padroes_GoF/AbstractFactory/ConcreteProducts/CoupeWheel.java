package Padroes_GoF.AbstractFactory.ConcreteProducts;

import Padroes_GoF.AbstractFactory.AbstractProducts.AbstractWheel;

public class CoupeWheel extends AbstractWheel {
    String aro;
    String material;

    public CoupeWheel(String aro, String material) {
        this.aro = aro;
        this.material = material;
    }

    @Override
    public void andar() {   
        System.out.println("Andando com a roda do Coupe de aro " + aro + " e material " + material);
    }
    
}
