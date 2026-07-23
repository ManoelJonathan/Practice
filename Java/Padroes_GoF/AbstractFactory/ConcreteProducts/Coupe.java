package Padroes_GoF.AbstractFactory.ConcreteProducts;

import Padroes_GoF.AbstractFactory.AbstractProducts.AbstractVeiculo;

public class Coupe extends AbstractVeiculo {
    String modelo;
    String nome;
  
    public Coupe(String modelo, String nome) {
        this.modelo = modelo;
        this.nome = nome;
    }
    
    @Override
    public void dirigir() {
        System.out.println("Dirigindo o veículo Coupe " + modelo + " de nome " + nome);
    }
    
}
