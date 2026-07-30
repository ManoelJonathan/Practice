package Padroes_GoF.Façade;

public class CarFacade {
    private final Engine engine;
    private final Transmission transmission;
    private final Ignition ignition;

    public CarFacade() {
        this.engine = new Engine();
        this.transmission = new Transmission();
        this.ignition = new Ignition();
    }

    public void startCar() {
        ignition.ignite();
        engine.turnOn();
        transmission.engage();
    }

    public void stopCar() {
        transmission.disengage();
        engine.turnOff();
        ignition.shutDown();
    }

    public void accelerate() {
        engine.increaseRPM();
    }
}
