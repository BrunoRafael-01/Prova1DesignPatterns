package logs;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class GenerateLogs {

    //  implementacao do singleton ==============================================================
    private static GenerateLogs instance;
    private GenerateLogs(){
    }
    public static GenerateLogs getInstance() {
        if (instance == null)
            instance = new GenerateLogs();
        return instance;
    }
    // ===========================================================================================

    Date dataHoraAtual = new Date();
    String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
    String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

    private ArrayList <String> logs = new ArrayList<>();
    public void gerarLog(String inf1, String inf2, int inf3, double inf4){
        String infLog = new String("New Log: data: " + data + " hora: " + hora +
                " inf: { Marca: " + inf1 + " Modelo: " + inf2 + " Ano: " + inf3 + " Preço: " + inf4 + " }");

        logs.add(infLog);
    }

    public ArrayList<String> getLogs() {
        return logs;
    }
}
