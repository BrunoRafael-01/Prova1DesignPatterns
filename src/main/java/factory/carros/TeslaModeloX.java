package factory.carros;

import logs.GenerateLogs;

public class TeslaModeloX implements Carro{

    private String marca;
    private String modelo;
    private int anoFab;
    private double preco;

    public TeslaModeloX() {
        this.marca = "Tesla";
        this.modelo = "X";
        this.anoFab = 2015;
        this.preco = 520000;
    }
    @Override
    public void gerarLog() {
        GenerateLogs logs = GenerateLogs.getInstance();
        logs.gerarLog(this.marca,this.modelo,this.anoFab,this.preco);
    }
}
