package Tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TXTReaderWitchStoreLogo {

    public void imprimirLogoWitchStore() throws FileNotFoundException{

        Scanner sc = new Scanner(new File("Files/WitchStore_logo.txt"));

        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

    }


}
