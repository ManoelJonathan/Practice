package Padroes_GoF.Adapter;

public class CarroEletrico {

    public void desconectarEnergia(){
        System.out.println("Carro elétrico desligado.");
    }

    public void iniciandoMotor(){
        System.out.println("Carro elétrico iniciando motor.");
    }

    public void aumentarPotencia(){
        System.out.println("Carro elétrico aumentando potência.");
    }
}
