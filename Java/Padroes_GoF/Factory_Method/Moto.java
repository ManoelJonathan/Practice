package Padroes_GoF.Factory_Method;

public class Moto implements Veiculo {
    private String modelo;
    private String nome;

    public Moto(String modelo, String nome) {
        this.modelo = modelo;
        this.nome = nome;   
    }

    @Override
    public void exibirInfo() {
        System.out.println("Moto: " + nome + ", Modelo: " + modelo);
    }

}