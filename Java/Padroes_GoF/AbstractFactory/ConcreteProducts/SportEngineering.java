package Padroes_GoF.AbstractFactory.ConcreteProducts;

import Padroes_GoF.AbstractFactory.AbstractProducts.AbstractEngineering;

public class SportEngineering extends AbstractEngineering {
    String descrição;

    public SportEngineering(String descrição) {
        this.descrição = descrição;
    }

    @Override
    public void project() {
        System.out.println("Projetando a engenharia do Sport: " + descrição);
    }

}