package View;

import Controllers.GameController;
import Controllers.StoreController;
import Domain.Heroina.*;
import Domain.Jogo;
import Tools.TXTReader;

import java.io.IOException;
import java.util.Scanner;

public class Menu_EncontroBruxaViajente {



public static void menuPrimeiroEncontro(Heroinas heroinaEscolhida) throws IOException {

    GameController criacao = new GameController();


    Entidade jogadora = new Entidade() {
        @Override
        public String getNome() {
            return super.getNome();
        }
    };

    StoreController store = new StoreController(jogadora);


    Scanner input = new Scanner(System.in);
    int opcao;






    //Colocar aqui o menu da dificuldade


    System.out.println("\n\n\n" +
            "Você acabou de chegar a vila e a o seu primeiro encontro é com a a Bruxa Viajante, e com ela estão itens valiosos que \n" +
            "você pode comprar agora, ou mais tarde\n");
    System.out.println("1. Falar com bruxa viajante\n");
    System.out.println("2. Não preciso de nada, obrigada!");
    opcao = input.nextInt();

    switch (opcao) {
        case 1:

            System.out.println();
            System.out.println("Olá guerreira! Você está preparada para a batalha?\nNão me parece muito preprada, mas eu posso ajudar, tenho isso a \n" +
                    "venda, poucas moedas em troca de uma batalha mais justa");
            TXTReader.imprimirFicheiro("src/Files/WitchStore_logo");
            store.exibirDetalhesStore();
            //Fazer menu da loja - imprimir itens da loja

            break;
        case 2:
            System.out.println("Até logo, você ainda vai precisar da minha ajuda!");
            Menu_Comeco_Missao iniciarMissao = new Menu_Comeco_Missao();
            iniciarMissao.primeiraMissao();
            break;
        default:
            System.out.println("Opção Inválida");

    }




}





}
