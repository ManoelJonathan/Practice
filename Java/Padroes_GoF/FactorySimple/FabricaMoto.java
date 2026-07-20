package Padroes_GoF.FactorySimple;

public class FabricaMoto implements FabricaInterface {
    @Override
    public Veiculo criarVeiculo(String modelo, String nome) {
        Moto moto = new Moto(modelo, nome);
        return moto;
    }
}
