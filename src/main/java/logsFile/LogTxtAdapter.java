package logsFile;

import java.util.ArrayList;

public class LogTxtAdapter extends LogTxt implements LogTarget {

    @Override
    public void informacoes (String nome, String layout) {
        gerarArquivoTxt(nome, layout);
    }

    @Override
    public void importDados(ArrayList<String> dados) {
        dadosArquivoTxt(dados);
    }
}
