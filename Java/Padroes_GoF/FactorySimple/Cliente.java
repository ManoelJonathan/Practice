package Padroes_GoF.FactorySimple;

public class Cliente {
    public static void main(String[] args){
       FabricaInterface fabricaCarro = new FabricaCarro();
       Veiculo carro = fabricaCarro.criarVeiculo("Sedan", "Toyota Camry");
       carro.exibirInfo();

        FabricaInterface fabricaMoto = new FabricaMoto();
        Veiculo moto = fabricaMoto.criarVeiculo("Esportiva", "Yamaha R1");
        moto.exibirInfo();
    }
}
