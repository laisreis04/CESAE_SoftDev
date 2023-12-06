package Ex_02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Logger log1 = Logger.getIntance("src/Ex_02/Files/logger.txt");

        log1.logAcontecimentos("Acrescentei a data e hora ");
        log1.logAcontecimentos("Deu certo");


    }
}
