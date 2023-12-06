package Ex_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Logger {

    private static Logger intance;
    private String caminho;

    private Logger(String caminho) {
        this.caminho = caminho;
    }

    public static Logger getIntance(String caminho){
        if(intance == null){
            intance = new Logger((caminho));
        }
        return intance;

    }



    public void logAcontecimentos (String mensagemLog) throws IOException {

        File ficheiroLog = new File(this.caminho);

        FileWriter writerMens = new FileWriter((this.caminho), true);
        LocalDate localDate = LocalDate.now();
        writerMens.append(localDate + ": " + mensagemLog + "\n");
        writerMens.close();
    }


}
