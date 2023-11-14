package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06 {

    /**Verificar a pessoa mais velha do ficheiro
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{

        File nomesIdades = new File("Ficha_JAVA/Ficheiros_07/exercicio_06.txt");

        Scanner lerIdades = new Scanner(nomesIdades);

        String nomePessoaMaisVelha = "";
        int idadePessoaMaisVelha = 0;




       while (lerIdades.hasNextLine()){
           String linha = lerIdades.nextLine();
           String[] todasIdades = linha.split(",");

           String nomes = todasIdades[0];
           int idade = Integer.parseInt(todasIdades[1]);

           if(idade > idadePessoaMaisVelha){
               idadePessoaMaisVelha = idade;
               nomePessoaMaisVelha = nomes;
           }


       }
            System.out.println("A pessoa mais velha é o " + nomePessoaMaisVelha + " e a sua idade é " +
                idadePessoaMaisVelha + " anos.");

            lerIdades.close();

            }

        }
        
        

    

