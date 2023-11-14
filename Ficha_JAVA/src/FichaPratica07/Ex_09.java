package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) throws FileNotFoundException {

        File ficheiro9 =new File("Ficha_JAVA/Ficheiros_07/exercicio_09.txt");

        Scanner lerFicheiro9 = new Scanner(ficheiro9);

        String palavraFrequente = "", linha;
        String novaPalavra = "";

        while(lerFicheiro9.hasNextLine()){
            linha = lerFicheiro9.nextLine();
            String[] palavraLinha = linha.split(" ");


            for(int i = 0; i < palavraLinha.length;i++){
                novaPalavra = palavraLinha[i];

                if(palavraFrequente.equals(novaPalavra)){

                    System.out.println("Palavra mais frequente é : " + novaPalavra);
                }

            }

        }

        lerFicheiro9.close();
    }

}
