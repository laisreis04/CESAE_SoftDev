package View;

import java.io.IOException;
import java.util.Scanner;


public class Menu_Dificuldade {


    public static void menu_Dificuldade() throws IOException{

        Scanner input = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("**************** DIFICULDADE *****************");
            System.out.println("1. De boa na lagoa (Fácil)");
            System.out.println("2. Boraaaaa (Dificil)");
            System.out.println("0. Voltar");
            opcao = input.nextInt();

            switch (opcao){

                case 1:
                    //colocar o caminho para o facil - ligar da heroinaController
                    break;

                case 0:
                   Menu_EncontroBruxaViajente.menuPrimeiroEncontro();
                    break;

                default:
                    System.out.println("Opção Invalida");

            }


        }while (opcao != 0);


    }


}
