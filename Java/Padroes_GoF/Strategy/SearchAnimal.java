package Padroes_GoF.Strategy;

import java.util.List;

public class SearchAnimal implements StrategyInterface {

    public List<String> search (){
        System.out.println("Aqui está sua lista de Animais");
        return List.of("Gato","Cachorro","Peixe");
    }

}
