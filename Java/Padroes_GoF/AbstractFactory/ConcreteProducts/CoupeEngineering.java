package Padroes_GoF.AbstractFactory.ConcreteProducts;

import Padroes_GoF.AbstractFactory.AbstractProducts.AbstractEngineering;

public class CoupeEngineering extends AbstractEngineering {
    String descrição;

    public CoupeEngineering(String descrição) {
        this.descrição = descrição;
    }


    @Override
    public void project() {
        System.out.println("Projetando a engenharia do Coupe: " + descrição);
    }
    
}
