package Padroes_GoF.Strategy;
import java.util.List;

public class SearchCar implements StrategyInterface{

    public List<String> search (){
        System.out.println("Aqui está sua lista de carros");
        return List.of("Lamborghini", "Ferrari","BMW");
    }


}
