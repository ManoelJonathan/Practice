package Padroes_GoF.Adapter;

public class CarroCombustao extends Veiculo {
    @Override
    public void ligar() {
        System.out.println("Carro a combustão ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Carro a combustão desligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("Carro a combustão acelerando.");
    }
}
