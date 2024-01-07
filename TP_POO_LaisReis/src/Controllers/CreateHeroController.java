package Controllers;

import Domain.Heroina.Heroinas;
import Domain.Heroina.Arqueira;
import Domain.Heroina.Cavaleira;
import Domain.Heroina.Feiticeira;


import java.util.Scanner;

public class CreateHeroController {

    public static Heroinas escolherHeroina(int dificuldadeEscolhida) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha sua heroína:");
        System.out.println("1. Cavaleira");
        System.out.println("2. Feiticeira");
        System.out.println("3. Arqueira");

        int opcaoHeroina = input.nextInt();

        int vidaAtual = 0;
        int forcaInicial = 0;


        switch (opcaoHeroina) {
            case 1:
                return new Cavaleira(); // Retorna uma instância de Cavaleira
            case 2:
                return new Feiticeira(); // Retorna uma instância de Feiticeira
            case 3:
                return new Arqueira(); // Retorna uma instância de Arqueira
            default:
                System.out.println("Opção inválida!");
                return null; // Retorna null se a opção for inválida
        }
    }

    public static void main(String[] args) {
        Heroinas heroinaEscolhida = escolherHeroina();

        if (heroinaEscolhida != null) {
            // Continuação do jogo com a heroína selecionada
            // Exemplo: iniciarMissao.primeiraMissao(heroinaEscolhida);
            System.out.println("Heroína escolhida: " + heroinaEscolhida.getClass().getSimpleName());
        } else {
            System.out.println("Escolha inválida. Tente novamente.");
        }
    }

}
