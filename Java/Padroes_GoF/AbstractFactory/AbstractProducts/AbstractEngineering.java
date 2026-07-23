package Padroes_GoF.AbstractFactory.AbstractProducts;

public abstract class AbstractEngineering {
    String descrição;

    public  void project(){
        System.out.println("Projetando a engenharia: " + descrição);
    };
}