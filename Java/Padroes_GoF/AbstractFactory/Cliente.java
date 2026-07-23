package Padroes_GoF.AbstractFactory;

import Padroes_GoF.AbstractFactory.AbstractProducts.AbstractEngineering;
import Padroes_GoF.AbstractFactory.AbstractProducts.AbstractVeiculo;
import Padroes_GoF.AbstractFactory.AbstractProducts.AbstractWheel;

public class Cliente {
    public static void main(String[] args) {
        AbstractFactory coupeFactory = new CoupeFactory();
        AbstractVeiculo veiculo = coupeFactory.criarVeiculo("Coupé", "BMW M2");
        AbstractEngineering engenharia = coupeFactory.criarEngenharia("Motor: 3.0 litros de 6 cilindros em linha biturbo");
        AbstractWheel roda = coupeFactory.criarRoda("18 polegadas", "Liga leve");

        veiculo.dirigir();
        engenharia.project();
        roda.andar();


        System.out.println();
        AbstractFactory sportFactory = new SportFactory();
        AbstractVeiculo veiculoSport = sportFactory.criarVeiculo("Sport", "Lamborghini Aventador");
        AbstractEngineering engenhariaSport = sportFactory.criarEngenharia("Motor: 6.5 litros V12 aspirado");
        AbstractWheel rodaSport = sportFactory.criarRoda("20 polegadas", "Fibra de carbono");

        veiculoSport.dirigir();
        engenhariaSport.project();
        rodaSport.andar();
    }
}