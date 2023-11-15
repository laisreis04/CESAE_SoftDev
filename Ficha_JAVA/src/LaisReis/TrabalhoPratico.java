package LaisReis;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrabalhoPratico {

    
    
    public static void main(String[] args) throws FileNotFoundException{
        
        
        /**
         * Menu Principal - Escolha do Tipo de Utilizador
         * Menu básico para o inicio do programa.
         */


         Scanner input = new Scanner(System.in);

         int opcao, passwordAdmin, menuCliente;

         do{
            System.out.println("Escolha o tipo de utilizador: ");

            System.out.println("1. Cliente");
            System.out.println("2. Administrador");
            System.out.println("3. Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("***  MENU ADMINISTRADOR ***");
                    passwordAdmin();
                    
                    break;

                case 2:

                // menuCliente();

                    break;

        
                
                default:
                System.out.println("*****GameStart******\n Obrigada e até a próxima!");
                    break;

            }

         }while (opcao != 3); 

    }

    /**
     * Método para verificar se a senha esta ou não correta
     * ps.: Usado apenas pelo Admin
     * @throws FileNotFoundException
     */

    public static void passwordAdmin() throws FileNotFoundException{

        Scanner input = new Scanner (System.in);

        int menuA;

        String passwordCorreta = "skateordie", passwordString;

        System.out.println("Yo! Digite a sua senha");
        passwordString = input.nextLine();

        if(passwordString.equals(passwordCorreta)){

            System.out.println("Password Coreta!");
            menuA();
        }else {
            System.out.println("Nice try, mas a pass está errada");
        }
    }

   /**
    * Menu admin
    */
    // public static void menuA
    
}
