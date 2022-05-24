package factory;

import factory.carros.Carro;
import factory.carros.DodgeCharge;
import factory.carros.DodgeDart;

public class FabricaDodge implements FabricaDeCarros{
    @Override
    public Carro criarCarroM1() {
        return new DodgeCharge();
    }

    @Override
    public Carro criarCarroM2() {
        return new DodgeDart();
    }
}
