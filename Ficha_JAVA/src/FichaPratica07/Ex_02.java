package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_02 {

    public static void main(String[] args) throws FileNotFoundException {

        File novoFicheiro = new File("Ficha_JAVA/Ficheiros_07/exercicio_02.txt");

        PrintWriter escritaNoFicheiro = new PrintWriter(novoFicheiro);

        String mensagem = "Funcionou Caralho !!!";

        escritaNoFicheiro.print(mensagem);

        escritaNoFicheiro.close();
    }
}
