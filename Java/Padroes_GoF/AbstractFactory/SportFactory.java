package Padroes_GoF.AbstractFactory;

import Padroes_GoF.AbstractFactory.AbstractProducts.AbstractEngineering;
import Padroes_GoF.AbstractFactory.AbstractProducts.AbstractVeiculo;
import Padroes_GoF.AbstractFactory.AbstractProducts.AbstractWheel;
import Padroes_GoF.AbstractFactory.ConcreteProducts.Sport;
import Padroes_GoF.AbstractFactory.ConcreteProducts.SportEngineering;
import Padroes_GoF.AbstractFactory.ConcreteProducts.SportWheel;

public class SportFactory extends AbstractFactory {

    @Override
    public AbstractVeiculo criarVeiculo(String modelo, String nome) {
        Sport sport = new Sport(modelo, nome);
        return sport;
    }

    @Override
    public AbstractEngineering criarEngenharia(String descrição) {
        SportEngineering sportEngineering = new SportEngineering(descrição);
        return sportEngineering;
    }

    @Override
    public AbstractWheel criarRoda(String aro, String material) {
        SportWheel sportWheel = new SportWheel(aro, material);
        return sportWheel;
    }
    
}
