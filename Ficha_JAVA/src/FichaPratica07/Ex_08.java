package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) throws FileNotFoundException {

        //Ficheiro a ser lido
        File ficheiro8 = new File("Ficha_JAVA/Ficheiros_07/exercicio_08.txt");

        //Novo Ficheiro
        File novoTexto08 = new File("Ficha_JAVA/Ficheiros_07/exercicio_08_NovoTexto.txt");

        Scanner texto8 = new Scanner(ficheiro8);

        //Escrever no ficheiro novo
        PrintWriter novoFicheiro8 = new PrintWriter(novoTexto08);

        String palavraChave = "turma";
        int contaArray = 0;



        while(texto8.hasNextLine()){
            String linhas = texto8.nextLine();
            String [] palavrasArrays = linhas.split(" ");


            // foi criado um loop para percorrer toda a linha
            for(int i = 0;i< palavrasArrays.length;i++){
                if(palavrasArrays[i].equals(palavraChave)){
                    System.out.println(linhas);
                    novoFicheiro8.println(linhas);
            }

            }

            contaArray++;
        }
        novoFicheiro8.close();
        texto8.close();

    }




}
