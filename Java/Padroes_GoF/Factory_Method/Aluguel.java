package Padroes_GoF.Factory_Method;

public abstract class Aluguel {

    public void alugar(String modelo, String nome) {
        Veiculo veiculo = criarVeiculo(modelo, nome);
        veiculo.exibirInfo();
    }

    protected abstract Veiculo criarVeiculo(String modelo, String nome);
}
