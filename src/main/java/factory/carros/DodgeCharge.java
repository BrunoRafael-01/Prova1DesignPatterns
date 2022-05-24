package factory.carros;

import logs.GenerateLogs;

public class DodgeCharge implements Carro{

    private String marca;
    private String modelo;
    private int anoFab;
    private double preco;

    public DodgeCharge() {
        this.marca = "Dodge";
        this.modelo = "Chager";
        this.anoFab = 2000;
        this.preco = 350000;
    }

    @Override
    public void gerarLog() {
        GenerateLogs logs = GenerateLogs.getInstance();
        logs.gerarLog(this.marca,this.modelo,this.anoFab,this.preco);
    }
}
