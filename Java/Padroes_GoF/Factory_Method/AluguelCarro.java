package Padroes_GoF.Factory_Method;

public class AluguelCarro extends Aluguel {
    
    @Override
    protected Veiculo criarVeiculo(String modelo, String nome) {
        return new Carro(modelo, nome);
    }
}
