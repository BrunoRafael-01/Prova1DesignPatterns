package logsFile;

import java.util.ArrayList;

public class LogTxt {

    public void gerarArquivoTxt(String nome, String layout){
        System.out.println(nome + ".txt");
    }

    public void dadosArquivoTxt(ArrayList<String> dados){
        for (String log : dados){
            System.out.println(log);
        }
    }
}
