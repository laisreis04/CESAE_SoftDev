package FichaPratica07;

import static FichaPratica07.BibliotecaFicheiros.*;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Ex_04 {

    public static void main(String[] args) throws FileNotFoundException {
        
        File ficheiroCsv = new File("Ficha_JAVA/Ficheiros_07/exercicio_04.csv");

        Scanner lerCsv = new Scanner(ficheiroCsv);

        while(lerCsv.hasNextLine()){
            String linha = lerCsv.nextLine();
            System.out.println(linha);
        }

        lerCsv.close();

    }
    
}
