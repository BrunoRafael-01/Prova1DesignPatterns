package logsFile;

import java.util.ArrayList;

public class LogXml {

    public void gerarArquivoXml(String nome){
        System.out.println(nome + ".xml");
    }

    public void dadosArquivoXml(ArrayList<String> dados){
        for (String log : dados){
            System.out.println(log);
        }
    }
}
