package View;

import Domain.Heroina.Entidade;
import Tools.TXTReader;

import java.io.IOException;
import java.util.Scanner;

public class Menu_EncontroBruxaViajente {



public static void menuPrimeiroEncontro() throws IOException{

    Scanner input = new Scanner(System.in);
    int opcao;

    String nome;

        do{


            //Escrever a história da witch store e como personagem foi para lá

            //Criar personagem - é preciso montar

            System.out.println("Precisamos da sua ajuda! Vamos tentar salvar as bruxas que foram queimadas na fogueira\n" +
                    "Estamos no vilareijo de Humberg, e Para começar a sua jornada antes de tuso tenho de conhecer melhor.\n\n" +
                    "Como você está se sentido hoje? Vamos escolher o melhor nivel de dificuldade?");

            //Colocar aqui o menu da difuculdade

            System.out.println("");
            System.out.println("1. Falar com bruxa viajante");
            System.out.println("2. Ah que medo! Sair, Sair, sair!!");
            opcao = input.nextInt();

            switch (opcao){
                case 1:

                    System.out.println();
                    System.out.println("Olá guerreira! Você está preparada para a bataha?\nNão me parece muito preprada, mas eu posso ajudar, tenho isso a venda, poucas moedas em troca de uma batalha mais justa");
                    TXTReader.imprimirFicheiro("src/Files/WitchStore_logo");
                    //Fazer menu da loja - imprimir itens da loja

                    break;
                case 2:

            }

        }while (opcao != 2);


}





}
