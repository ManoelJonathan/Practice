package Padroes_GoF.Factory_Method;

public class Cliente {
    public static void main(String[] args){
        Aluguel aluguelCarro = new AluguelCarro();
        aluguelCarro.alugar("Sedan", "Toyota Camry");

        Aluguel aluguelMoto = new AluguelMoto();
        aluguelMoto.alugar("Esportiva", "Yamaha R1");
    }
}
