package Padroes_GoF.Adapter;

public class Cliente {
    public static void main(String[] args) {
        Veiculo carroCombustao = new CarroCombustao();
        Veiculo carroEletrico = new MotorEletricoAdapter(new CarroEletrico());

        System.out.println("\nCarro elétrico:");
        carroEletrico.ligar();
        carroEletrico.desligar();
        carroEletrico.acelerar();


        System.out.println("\nCarro a combustão:");
        carroCombustao.ligar();
        carroCombustao.desligar();

    }
}