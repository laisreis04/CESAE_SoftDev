package View;

import Tools.TXTReader;

import java.io.IOException;
import java.util.Scanner;

public class Menu_Inicial {

    public Menu_Inicial(){

    }
    public static void MenuInicial() throws IOException {

        Scanner input = new Scanner(System.in);

        int opcao;

        do{

            TXTReader.imprimirFicheiro("src/Files/Game_logo");
            // ? Como eu faço para colocar aqui arquivo do logo

            System.out.println();
            System.out.println("COMEÇAR JOGO");
            System.out.println("1. YES");
            System.out.println("2. NO");


            opcao=input.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Você está voltando para o século XV, prepare-se para a aventura que esta prestes a começar");
                    System.out.println();
                    //Opçao para falar com a bruxa
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro();
                    //Ir para o segundo menu
                    break;

                case 2:
                    System.out.println("Byeee");
                    break;

                default:
                    System.out.println("Opção Inválida");

            }

        }while(opcao != 2);

    }





}
