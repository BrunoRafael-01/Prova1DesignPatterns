package factory;

import factory.carros.Carro;
import factory.carros.TeslaModeloS;
import factory.carros.TeslaModeloX;

public class FabricaTesla implements FabricaDeCarros{
    @Override
    public Carro criarCarroM1() {
        return new TeslaModeloS();
    }

    @Override
    public Carro criarCarroM2() {
        return new TeslaModeloX();
    }
}
