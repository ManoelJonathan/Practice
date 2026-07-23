package Padroes_GoF.AbstractFactory;

import Padroes_GoF.AbstractFactory.AbstractProducts.AbstractEngineering;
import Padroes_GoF.AbstractFactory.AbstractProducts.AbstractVeiculo;
import Padroes_GoF.AbstractFactory.AbstractProducts.AbstractWheel;

public abstract class AbstractFactory {
    
    public abstract AbstractVeiculo criarVeiculo(String modelo, String nome);
    public abstract AbstractEngineering criarEngenharia(String descrição);
    public abstract AbstractWheel criarRoda(String aro, String material);
    
}