package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06 {

    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{

        File nomesIdades = new File("Ficha_JAVA/Ficheiros_07/exercicio_06.txt");

        Scanner lerIdades = new Scanner(nomesIdades);

        int idade, maisVelho = 0;
        String nomes, nomeMaisVelho = "";

        while(lerIdades.hasNext()){
                //para ler e verificar só os inteiros
            nomes = lerIdades.next();
            idade = lerIdades.nextInt();

            if(idade > maisVelho){
                maisVelho = idade;
                nomeMaisVelho= nomes;
            }
            }
            System.out.println("A pessoa mais velha é: " + nomeMaisVelho + "e tem" + maisVelho + "anos");
        lerIdades.close();
        }
        
        
    }
    

