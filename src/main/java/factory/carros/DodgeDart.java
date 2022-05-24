package factory.carros;

import logs.GenerateLogs;

public class DodgeDart implements Carro{

    private String marca;
    private String modelo;
    private int anoFab;
    private double preco;

    public DodgeDart() {
        this.marca = "Dodge";
        this.modelo = "Dart";
        this.anoFab = 1980;
        this.preco = 230000;
    }

    @Override
    public void gerarLog() {
        GenerateLogs logs = GenerateLogs.getInstance();
        logs.gerarLog(this.marca,this.modelo,this.anoFab,this.preco);
    }
}
