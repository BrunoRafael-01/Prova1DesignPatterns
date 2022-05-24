package logsFile;

import java.util.ArrayList;

public interface LogTarget {

    void informacoes (String nome, String layout);
    void importDados (ArrayList<String> dados);

}
