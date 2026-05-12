package Padroes_GoF.Strategy;

public class Main {
    public static void main(String[] args) {
        Buscador buscador = new Buscador();

        buscador.setEstrategia(new SearchAnimal());
        buscador.executeSearch();

        System.out.println();

        buscador.setEstrategia(new SearchCar());
        buscador.executeSearch();

    }
    
}
