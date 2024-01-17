package View;

import Controllers.StoreController;
import Domain.Heroina.*;

import java.io.IOException;
import java.util.Scanner;

public class Menu_EncontroBruxaViajente {


    /**
     * Método para apresentar o menu da loja
     * @param heroinaEscolhida
     * @throws IOException
     * @throws InterruptedException
     */
    public static void menuPrimeiroEncontro(Heroinas heroinaEscolhida) throws IOException, InterruptedException {

        StoreController store = new StoreController();

        Scanner input = new Scanner(System.in);
        int opcao;


    System.out.println("\n\n\n" +
            "Olá " + heroinaEscolhida.getNome() + "\n Você acabou de chegar a vila e a o seu primeiro encontro \né com a a Bruxa Viajante, e com ela estão itens valiosos que \n" +
            "você pode comprar agora, ou mais tarde\n\n");
    System.out.println("1. Falar com bruxa viajante\n");
    System.out.println("2. Não preciso de nada, obrigada!");
    opcao = input.nextInt();

    switch (opcao) {
        case 1:
            store.exibirDetalhesStore();


            break;
        case 2:
            System.out.println("\nAté logo, você ainda vai precisar da minha ajuda!");
            Menu_Comeco_Missao iniciarMissao = new Menu_Comeco_Missao();
            iniciarMissao.primeiraMissao();
            break;
        default:
            System.out.println("Opção Inválida");

    }

}

}
