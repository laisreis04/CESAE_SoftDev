package View;

import Controllers.GameController;
import Domain.Heroina.Entidade;
import Domain.Heroina.Heroinas;
import Domain.Heroina.NPC;
import Domain.Itens.ItemHeroina;
import Domain.Itens.Pocao;
import Tools.TXTReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu_Comeco_Missao {

    private Entidade jogadora;


    /**
     * Método para abrir o menu da escolha dos caminhos
     * @throws IOException
     * @throws InterruptedException
     */
    public void primeiraMissao() throws IOException, InterruptedException {

        Scanner input = new Scanner(System.in);

        int opcao;


        System.out.println("* ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►** ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►** ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►*\n");
        System.out.println("Você pode escolher entra dois caminhos:\n");
        System.out.println("1. CAMINHO DO LAGO VERDE:\n");
        System.out.println("2. TRILHA VILA CHÃ:\n");
        System.out.println("3. VER VIDA E FORÇA");

        opcao = input.nextInt();


        switch (opcao) {

            case 1:
                Sala_A salaA = new Sala_A();
                salaA.menuSala_A();
                break;

            case 2:
                Sala_B.salaB();
                break;

            case 3:
                System.out.println("VIDA =" + jogadora.getVidaAtual());
                System.out.println("Força =" + jogadora.getForca());
                System.out.println("Escolher caminho:\n");
                System.out.println("1. CAMINHO DO LAGO VERDE:\n");
                System.out.println("2. TRILHA VILA CHÃ:\n");
                opcao = input.nextInt();
                if (opcao == 1) {
                    Sala_A sala = new Sala_A();
                    sala.menuSala_A();
                } else {
                    Sala_B.salaB();
                }

                break;

            default:
                System.out.println("Opção Inválida");

        }


    }

}
