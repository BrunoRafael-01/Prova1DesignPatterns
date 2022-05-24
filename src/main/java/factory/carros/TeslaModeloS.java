package factory.carros;

import logs.GenerateLogs;

public class TeslaModeloS implements Carro{

    private String marca;
    private String modelo;
    private int anoFab;
    private double preco;

    public TeslaModeloS() {
        this.marca = "Tesla";
        this.modelo = "S";
        this.anoFab = 2010;
        this.preco = 470000;
    }

    @Override
    public void gerarLog() {
        GenerateLogs logs = GenerateLogs.getInstance();
        logs.gerarLog(this.marca,this.modelo,this.anoFab,this.preco);
    }
}
