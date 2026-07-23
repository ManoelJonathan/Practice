package Padroes_GoF.AbstractFactory.AbstractProducts;

public abstract class AbstractVeiculo {
    String modelo;
    String nome;

    public void dirigir() {
        System.out.println("Dirigindo o veículo " + modelo + " de nome " + nome);
    }
}
