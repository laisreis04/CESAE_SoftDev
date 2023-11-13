package FichaPratica07;

import java.io.FileNotFoundException;

import static FichaPratica07.BibliotecaFicheiros.*;

import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;


public class Ex_03 {


    public static void main(String[] args) throws FileNotFoundException {


        //para ler o ficheiro // para chamar o ficheiro que já existe para dentro do programa
        File ficheiroOriginal = new File("Ficha_JAVA/Ficheiros_07/exercicio_03.txt");


        //criar um novo ficheiro
        File novoFicheiro = new File("Ficha_JAVA/Ficheiros_07/exercicio_03_NovoTexto.txt");

        //Scanner - Para ler o  ficheiro
        Scanner maquinadeLer = new Scanner(ficheiroOriginal);

        //PrintWriter - Para escrever no novo ficheiro
        PrintWriter maquinaEscrever = new PrintWriter(novoFicheiro);

        String linhaAtual;


        while (maquinadeLer.hasNextLine()) {
            linhaAtual = maquinadeLer.nextLine();
            maquinaEscrever.println(linhaAtual);
        }


        maquinaEscrever.close();


    }


}

