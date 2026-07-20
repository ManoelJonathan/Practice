package Padroes_GoF.Factory_Method;

public class AluguelMoto extends Aluguel {
    
    @Override
    protected Veiculo criarVeiculo(String modelo, String nome) {
        return new Moto(modelo, nome);
    }
}
