package Padroes_GoF.Visitor;


public class Motorcycle implements Vehicle {
    private String placa;
    private String quilometragem;
    private String numeroChassi;

    public Motorcycle(String placa, String quilometragem, String numeroChassi) {
        this.placa = placa;
        this.quilometragem = quilometragem;
        this.numeroChassi = numeroChassi;
    }

    public String getPlaca() {
        return placa;
    }

    public String getQuilometragem() {
        return quilometragem;
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
}
