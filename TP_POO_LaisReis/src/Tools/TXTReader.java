package Tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TXTReader {

    public TXTReader() {

    }

    public static void imprimirFicheiro(String filePath) throws FileNotFoundException{

        Scanner sc = new Scanner(new File(filePath));

        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

    }

}
