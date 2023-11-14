package LaisReis;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrabalhoPratico {

    public static void main(String[] args) throws FileNotFoundException{
        
        /**
         * Menu Principal - Escolha do Tipo de Utilizador
         */

         Scanner input = new Scanner(System.in);

         int opcao;

         do{
            System.out.println("Escolha o tipo de utilizador: ");

            System.out.println("1. Cliente");
            System.out.println("2. Administrador");
            System.out.println("3. Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    /*Função que direciona para o menu do cliente */
                    
                    break;

                case 2:
                /* Função que direciona para o menu do administrador */
                    break;

        
                
                default:
                System.out.println("*****GameStart******\n Obrigada e até a próxima!");
                    break;

            }

         }while (opcao != 3); 

    }
    
}
