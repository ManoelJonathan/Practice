package Padroes_GoF.Singleton;

public class GerenciamentoFrota {


    private static GerenciamentoFrota instance;
    private int quantidadeVeiculos;

    private GerenciamentoFrota(){
        quantidadeVeiculos = 0;
    }

    public static GerenciamentoFrota getInstance() {
        if (instance == null) {
            instance = new GerenciamentoFrota();
        }
        return instance;
    }
    
    public void adicionarVeiculo() {
        quantidadeVeiculos++;
        System.out.println("Veículo adicionado. Total de veículos: " + quantidadeVeiculos);
    }
}
