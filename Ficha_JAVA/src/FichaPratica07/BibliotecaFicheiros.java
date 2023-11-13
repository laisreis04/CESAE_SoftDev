package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BibliotecaFicheiros {
    /**
     * Função para imprimir os textos dos ficheiros
     * @param caminho - Parametro usado
     * @throws FileNotFoundException
     */

    public static void imprimirFicheiro(String caminho) throws FileNotFoundException{

        Scanner fileScanner = new Scanner(new File(caminho));

        String linha;

        while( fileScanner.hasNextLine()){
            linha = fileScanner.nextLine();
            System.out.println(linha);
        }
    }
}
