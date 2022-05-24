package Client;

import factory.FabricaDeCarros;
import factory.FabricaDodge;
import factory.FabricaTesla;
import factory.carros.Carro;
import logs.GenerateLogs;
import logsFile.LogTarget;
import logsFile.LogTxtAdapter;
import logsFile.LogXmlAdapter;

public class Client {
    public static void main(String[] args) {

        FabricaDeCarros fabricaD = new FabricaDodge();
        Carro carro1 = fabricaD.criarCarroM1();
        carro1.gerarLog();
        Carro carro2 = fabricaD.criarCarroM2();
        carro2.gerarLog();


        FabricaDeCarros fabricaT = new FabricaTesla();
        Carro carro3 = fabricaT.criarCarroM1();
        carro3.gerarLog();
        Carro carro4 = fabricaT.criarCarroM2();
        carro4.gerarLog();


        GenerateLogs historicoLogs = GenerateLogs.getInstance();

        LogTarget gerarArquivo1 = new LogTxtAdapter();
        gerarArquivo1.informacoes("logs","padrão");
        gerarArquivo1.importDados(historicoLogs.getLogs());

        LogTarget gerarArquivo2 = new LogXmlAdapter();
        gerarArquivo2.informacoes("dadosCarros", null);
        gerarArquivo2.importDados(historicoLogs.getLogs());
    }
}
