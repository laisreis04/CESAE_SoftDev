package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) throws FileNotFoundException {

        File ficheiro7 = new File("Ficha_JAVA/Ficheiros_07/exercicio_07.txt");

        Scanner texto7 = new Scanner(ficheiro7);

        int contadorLinhas = 0, contadorPalavras = 0;


        while(texto7.hasNextLine()){
            contadorLinhas++;
            String linha = texto7.nextLine();
            String[] linhaTexto = linha.split("");
            contadorPalavras += linhaTexto.length;
        }
        System.out.println("Número de linhas: " + contadorLinhas);
        System.out.println("Numero de palavras: " + contadorPalavras);

        texto7.close();
    }

}
