package Padroes_GoF.FactorySimple;

public class Carro implements Veiculo {
    private String modelo;
    private String nome;

    public Carro(String modelo, String nome) {
        this.modelo = modelo;
        this.nome = nome;   
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro: " + nome + ", Modelo: " + modelo);
    }

}
