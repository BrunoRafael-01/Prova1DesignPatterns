package logsFile;

import java.util.ArrayList;

public class LogXmlAdapter extends LogXml implements LogTarget {

    @Override
    public void informacoes (String nome, String layout) {
        gerarArquivoXml(nome);
    }

    @Override
    public void importDados (ArrayList<String> dados) {
        dadosArquivoXml(dados);
    }
}
