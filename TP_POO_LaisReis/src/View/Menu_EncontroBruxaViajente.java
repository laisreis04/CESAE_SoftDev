package View;

import Controllers.Points_DistributionController;
import Controllers.StoreController;
import Domain.Heroina.*;
import Tools.TXTReader;

import java.io.IOException;
import java.util.Scanner;

public class Menu_EncontroBruxaViajente {



public static void menuPrimeiroEncontro() throws IOException {

    Points_DistributionController criacao = new Points_DistributionController();

    Heroinas cavaleira = new Cavaleira();
    Heroinas feiticeira = new Feiticeira();
    Heroinas arqueira = new Arqueira();

    StoreController store = new StoreController();

    Scanner input = new Scanner(System.in);
    int opcao;


    //Escrever a história da witch store e como personagem foi para lá

    //Criar personagem - é preciso montar

    System.out.println("Nos recônditos sombrios da vila de Salem, um vento gélido carrega murmúrios de medo e opressão. " +
            "A chama da superstição incendeia corações, transformando vizinhos em acusadores e amigos em vítimas. " +
            "A bruxaria, um sinônimo de poder e mistério, tornou-se uma sentença de morte.\n" +
            "\n" +
            "Eis que emerge nossa heroína, uma alma corajosa, destinada a desafiar o dogma opressor dos Templários, Inquisidores e Caçadores. " +
            "Ela é a voz das que estão silenciadas, a luz na escuridão, e sua missão é ousada: libertar as bruxas injustamente acusadas das garras da tirania.\n" +
            "\n" +
            "Na véspera da batalha, o destino aguarda sua escolha. " +
            "Diante de caminhos perigosos, tome decisões sábias, pois cada escolha moldará seu destino e o desfecho dessa jornada épica.\n" +
            "\n" +
            "Prepare-se para a aventura e a luta pela justiça, pois o destino de Salem está em suas mãos!");

    //Colocar aqui o menu da dificuldade
    do {

    System.out.println("\n\n\n" +
            "Você acabou de chegar a vila e a o seu primeiro encontro é com a a Bruxa Viajante, e com ela estão itens valiosos que você pode comprar agora, ou mais tarde");
    System.out.println("1. Falar com bruxa viajante");
    System.out.println("2. Ah que medo! Sair, Sair, sair!!");
    opcao = input.nextInt();

    switch (opcao) {
        case 1:

            System.out.println();
            System.out.println("Olá guerreira! Você está preparada para a bataha?\nNão me parece muito preprada, mas eu posso ajudar, tenho isso a venda, poucas moedas em troca de uma batalha mais justa");
            TXTReader.imprimirFicheiro("src/Files/WitchStore_logo");
            store.exibirDetalhesStore();
            //Fazer menu da loja - imprimir itens da loja

            break;
        case 2:
            System.out.println("Até logo, você ainda vai precisar da minha ajuda!");
            break;
        default:
            System.out.println("Opção Inválida");

    }
} while (opcao != 2);



}





}
