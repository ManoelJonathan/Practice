package Padroes_GoF.FlyWeight;

public class CarModel implements VehicleFlyWeight {
    private String modelo;
    private String marca;
    private String cor;
    private String tipoMotor;
    private String categoria;

    public CarModel(String modelo, String marca, String cor, String tipoMotor, String categoria) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.tipoMotor = tipoMotor;
        this.categoria = categoria;
    }

    @Override
    public void start(String placa, String quilometragem, String numeroChassi) {
        System.out.println("Carro " + this.modelo + " da marca " + this.marca + " está ligado:" + this.cor + " "
                + this.tipoMotor + " " + this.categoria+ " Placa: " + placa + " Quilometragem: " + quilometragem + " Número do Chassi: ");
    }

    @Override
    public void stop() {
        System.out.println("Carro " + this.modelo + " da marca " + this.marca + " está desligado.");
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public String getCategoria() {
        return categoria;
    }
}
