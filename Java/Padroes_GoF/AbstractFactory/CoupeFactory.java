package Padroes_GoF.AbstractFactory;

import Padroes_GoF.AbstractFactory.AbstractProducts.AbstractEngineering;
import Padroes_GoF.AbstractFactory.AbstractProducts.AbstractVeiculo;
import Padroes_GoF.AbstractFactory.AbstractProducts.AbstractWheel;
import Padroes_GoF.AbstractFactory.ConcreteProducts.Coupe;
import Padroes_GoF.AbstractFactory.ConcreteProducts.CoupeEngineering;
import Padroes_GoF.AbstractFactory.ConcreteProducts.CoupeWheel;

public class CoupeFactory extends AbstractFactory {
    
    @Override
    public AbstractVeiculo criarVeiculo(String modelo, String nome) {
        Coupe coupe = new Coupe(modelo, nome);
        return coupe;
    }

    @Override
    public AbstractEngineering criarEngenharia(String descrição) {
        CoupeEngineering coupeEngineering = new CoupeEngineering(descrição);
        return coupeEngineering;
    }

    @Override
    public AbstractWheel criarRoda(String aro, String material) {
        CoupeWheel coupeWheel = new CoupeWheel(aro, material);
        return coupeWheel;
    }
    
}
