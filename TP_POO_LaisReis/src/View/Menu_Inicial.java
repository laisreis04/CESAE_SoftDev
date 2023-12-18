package View;

import Tools.TXTReader;

import java.io.FileNotFoundException;
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
                    System.out.println("Escrever história inicio");
                    System.out.println();
                    //Opçao para falar com a bruxa
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro();
                    //Ir para o segundo menu
                    break;

                default:
                    System.out.println("Bye");

            }

        }while(opcao != 2);

    }





}
