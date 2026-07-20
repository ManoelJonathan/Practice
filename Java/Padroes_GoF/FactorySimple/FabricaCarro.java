package Padroes_GoF.FactorySimple;

public class FabricaCarro implements FabricaInterface {
    @Override
    public Veiculo criarVeiculo(String modelo, String nome) {
        Carro carro = new Carro(modelo, nome);
        return carro;
    }
}
