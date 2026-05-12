package Padroes_GoF.Strategy;

import java.util.List;

public class Buscador {

    private StrategyInterface estrategia;

    public void setEstrategia(StrategyInterface estrategia) {
        this.estrategia = estrategia;
    }

    public void executeSearch() {
        List<String> resultado = this.estrategia.search();
        System.out.println(resultado);
    }

}
