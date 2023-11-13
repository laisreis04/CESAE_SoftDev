package FichaPratica07;

import java.io.FileNotFoundException;

import static FichaPratica07.BibliotecaFicheiros.*;

import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;


public class Ex_03 {
/**
 * Fiz merda aqui, corrigir....
 * @param args
 * @throws FileNotFoundException
 */

    public static void main(String[] args) throws FileNotFoundException {


        //para ler o ficheiro // para chamar o ficheiro que já existe para dentro do programa
        File ficheiroOriginal = new File("Ficha_JAVA/Ficheiros_07/exercicio_03.txt");
        // File fichreiroOriginal2 = new File ("Ficha_JAVA/Ficheiros_07/exercicio_03_Alternativa01.txt");


        //criar um novo ficheiro
        File novoFicheiro = new File("Ficha_JAVA/Ficheiros_07/exercicio_03_NovoTexto.txt");
        

        //Scanner - Para ler o  ficheiro
        Scanner maquinadeLer = new Scanner(ficheiroOriginal);
        // Scanner maquinadeLer2 = new Scanner(fichreiroOriginal2);


        //PrintWriter - Para escrever no novo ficheiro
        PrintWriter maquinaEscrever = new PrintWriter(novoFicheiro);
        // PrintWriter maquinaEscrever2 = new PrintWriter(novoFicheiro);

        String linhaAtual;


        while (maquinadeLer.hasNextLine()) {
            linhaAtual = maquinadeLer.nextLine();
            maquinaEscrever.println(linhaAtual);
        }

        // while(maquinadeLer2.hasNextLine()){
        //     linhaAtual = maquinadeLer2.nextLine();
        //     maquinaEscrever2.println(linhaAtual);
        // }

        maquinaEscrever.close();


    }


}

