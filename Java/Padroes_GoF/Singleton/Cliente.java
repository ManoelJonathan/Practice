package Padroes_GoF.Singleton;

public class Cliente {
    public static void main(String[] args) {
        GerenciamentoFrota gerenciamentoFrota = GerenciamentoFrota.getInstance();
        gerenciamentoFrota.adicionarVeiculo();
        gerenciamentoFrota.adicionarVeiculo();
        gerenciamentoFrota.adicionarVeiculo();

        System.out.println();
        System.out.println("Tentando criar uma nova instância de GerenciamentoFrota...");
        GerenciamentoFrota novaInstancia = GerenciamentoFrota.getInstance();
        novaInstancia.adicionarVeiculo();

        System.out.println();
        System.out.println(gerenciamentoFrota == novaInstancia); 
    }
    
}
