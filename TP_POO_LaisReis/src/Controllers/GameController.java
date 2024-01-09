package Controllers;

import Domain.Heroina.*;
import Domain.Itens.ItemHeroina;
import Repository.WitchStoreRepository;
import View.Menu_EncontroBruxaViajente;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameController {


    /**
     * Método para criar uma personagem. Vida, força, nome.
     * @return Heroina
     * @throws IOException
     * @throws InterruptedException
     */
    public Heroinas parametros_Dificuldade() throws IOException, InterruptedException {

        Scanner input = new Scanner(System.in);

        int dificuldade, forca;

        System.out.println("Vamos começar o nosos jogo, qual o seu nome ?");
        String nome = input.next();


        int opcao;


        System.out.println("╔═.✵.══════════════════════════════════╗\n");
        System.out.println("Que tipo de heroina quer ser?");
        System.out.println();

        System.out.println("1. Cavaleira");
        System.out.println("2. Feiticeira");
        System.out.println("3. Arqueira");
        System.out.println("0. Sair");
        opcao = input.nextInt();
        System.out.println();
        System.out.println("╚════════════════════════════════.✵.═╝");  //40*

        //Dificuldade
        System.out.println("╔═.✵.══════════════════════════════════╗\n");
        System.out.println("Qual o nível de dificuldade?\n");
        System.out.println("╚════════════════════════════════.✵.═╝");  //40*

        System.out.println("1. Fácil, hoje eu tô de boas \n" +
                "(Pontos Iniciais: 300)\n\n");
        System.out.println("2. Dificil, preparadx para qualquer desafio!\n" +
                "(Pontos Iniciais: 220)\n\n");
        dificuldade = input.nextInt();

        //Opção de dificuldade
        int pontosIniciais = 0;
        if (dificuldade == 1) {
            pontosIniciais = 300;
            System.out.println("Nível fácil escolhido\n\n");
        } else if (dificuldade == 2) {
            pontosIniciais = 220;
            System.out.println("Nível difícil escolhido\n\n");
        } else {
            System.out.println("Opção inválida baby...\n\n");
        }


        System.out.println("Nem tudo são flores, temos que distribuir a sua força.\n" +
                "Mas como nem tudo são flores, fica a tabela de pontos:\n" +
                "1pw Força = 5 Pontos Iniciais\n");

        System.out.print("Força: ");
        forca = input.nextInt() * 5;

        //Set de vida Máxima
        Heroinas tipoHeroina = null;


        switch (opcao) {

            case 1:
                System.out.println("**** CAVALEIRA SELECIONADA ****");
                System.out.println();
                if (dificuldade == 1) {
                    int vidaMax = tipoHeroina.setVidaMax(300);
                    int forca_Facil = tipoHeroina.setForca(forca);
                    System.out.println("Sua força total é: " + forca_Facil + "pw");
                    int moeda_facil = 80;
                    System.out.println("Total de moedas: " + 80 + "diñero");
                    int vida_Facil = tipoHeroina.setVidaAtual(vidaMax - forca);
                    System.out.println("Total de Vida: " + vida_Facil + "pts");
                    tipoHeroina = new Cavaleira(nome, vidaMax, vida_Facil, forca_Facil, 1, moeda_facil);
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro(tipoHeroina);

                } else if (dificuldade == 2) {
                    int vidaMax = tipoHeroina.setVidaMax(220);
                    int forca_Dificil = tipoHeroina.setForca(forca);
                    System.out.println("Sua força total é: " + forca_Dificil + "pw");
                    int moedas_dificil = 40;
                    System.out.println("Total de moedas: " + moedas_dificil + "diñero");
                    int vida_Dificil = tipoHeroina.setVidaAtual(vidaMax - forca);
                    System.out.println("Total de Vida: " + vida_Dificil + "pts");
                    tipoHeroina = new Cavaleira(nome, vidaMax, vida_Dificil, forca_Dificil, 1, moedas_dificil);
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro(tipoHeroina);

                } else {

                    System.out.println("Opção invalida");
                }


                break;
            case 2:
                System.out.println("**** FEITICEIRA SELECIONADA ****");
                System.out.println();
                if (dificuldade == 1) {

                    int vidaMax = tipoHeroina.setVidaMax(300);
                    int forca_Facil = tipoHeroina.setForca(forca);
                    System.out.println("Sua força total é: " + forca_Facil + "pw");
                    int moedas_Facil = 80;
                    System.out.println("Total de moedas: " + moedas_Facil + "diñero");
                    int vida_Facil = tipoHeroina.setVidaAtual(vidaMax - forca);
                    System.out.println("Total de Vida: " + vida_Facil + "pts");
                    tipoHeroina = new Feiticeira(nome, vidaMax, vida_Facil, forca_Facil, 1, moedas_Facil);
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro(tipoHeroina);

                } else if (dificuldade == 2) {
                    int vidaMax = tipoHeroina.setVidaMax(220);
                    int forca_Dificil = tipoHeroina.setForca(forca);
                    System.out.println("Sua força total é: " + forca_Dificil + "pw");
                    int moedas_dificil = 40;
                    System.out.println("Total de moedas: " + moedas_dificil + "diñero");
                    int vida_Dificil = tipoHeroina.setVidaAtual(vidaMax - forca);
                    System.out.println("Total de Vida: " + vida_Dificil + "pts");
                    tipoHeroina = new Feiticeira(nome, vidaMax, vida_Dificil, forca_Dificil, 1, moedas_dificil);
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro(tipoHeroina);

                } else {

                    System.out.println("Opção invalida");

                }

                break;
            case 3:
                System.out.println("**** ARQUEIRA SELECIONADA ****");
                System.out.println();

                if (dificuldade == 1) {
                    int vidaMax = tipoHeroina.setVidaMax(300);
                    int forca_Facil = tipoHeroina.setForca(forca);
                    System.out.println("Sua força total é: " + forca_Facil + "pw");
                    int moedas_Facil = 80;
                    System.out.println("Total de moedas: " + moedas_Facil + "diñero");
                    int vida_Facil = tipoHeroina.setVidaAtual(vidaMax - forca);
                    System.out.println("Total de Vida: " + vida_Facil + "pts");
                    tipoHeroina = new Arqueira(nome, vidaMax, vida_Facil, forca_Facil, 1, moedas_Facil);
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro(tipoHeroina);

                } else if (dificuldade == 2) {
                    int vidaMax = tipoHeroina.setVidaMax(220);
                    int forca_Dificil = tipoHeroina.setForca(forca);
                    System.out.println("Sua força total é: " + forca_Dificil + "pw");
                    int moedas_dificil = 40;
                    System.out.println("Total de moedas: " + moedas_dificil + "diñero");
                    int vida_Dificil = tipoHeroina.setVidaAtual(vidaMax - forca);
                    System.out.println("Total de Vida: " + vida_Dificil + "pts");
                    tipoHeroina = new Arqueira(nome, vidaMax, vida_Dificil, forca_Dificil, 1, moedas_dificil);
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro(tipoHeroina);

                } else {

                    System.out.println("Opção invalida");
                }

                break;

            default:
                System.out.println("Opção inválida");

        }

        return tipoHeroina;
    }
}




