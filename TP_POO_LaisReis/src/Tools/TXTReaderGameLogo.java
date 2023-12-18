package Tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TXTReaderGameLogo {

    public void imprimirGameLogo() throws FileNotFoundException{

        Scanner sc = new Scanner(new File("Files/Game_logo.txt"));

        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

    }

}
