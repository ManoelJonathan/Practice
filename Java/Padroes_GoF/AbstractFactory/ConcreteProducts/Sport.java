package Padroes_GoF.AbstractFactory.ConcreteProducts;

import Padroes_GoF.AbstractFactory.AbstractProducts.AbstractVeiculo;

public class Sport extends AbstractVeiculo {
    String modelo;
    String nome;

    public Sport(String modelo, String nome) {
        this.modelo = modelo;
        this.nome = nome;
    }

    @Override
    public void dirigir() {
        System.out.println("Dirigindo o veículo Sport " + modelo + " de nome " + nome);
    }
}
