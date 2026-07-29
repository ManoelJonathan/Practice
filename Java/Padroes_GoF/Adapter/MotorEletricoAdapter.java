package Padroes_GoF.Adapter;

public class MotorEletricoAdapter extends Veiculo {
    private CarroEletrico carroEletrico;

    public MotorEletricoAdapter(CarroEletrico carroEletrico) {
        this.carroEletrico = carroEletrico;
    }

    @Override
    public void ligar() {
        carroEletrico.iniciandoMotor();
    }

    @Override
    public void desligar() {
        carroEletrico.desconectarEnergia();
    }

    @Override
    public void acelerar() {
        carroEletrico.aumentarPotencia();
    }
}
