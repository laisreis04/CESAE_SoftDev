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


    private ArrayList<ItemHeroina> itensLoja;
    private int vidaAtual;


    public GameController() throws FileNotFoundException {

        WitchStoreRepository repository = new WitchStoreRepository("src/Files/ItensHeroiRPG.csv");
        this.itensLoja = repository.getItensLista();

    }

    Entidade heroina = new Entidade() {
        @Override
        public int getVidaMax() {
            return super.getVidaMax();
        }

        @Override
        public int getVidaAtual() {
            return super.getVidaAtual();
        }

        @Override
        public int getForca() {
            return super.getForca();
        }

        @Override
        public String getNome() {
            return super.getNome();
        }
    };


    public void parametros_Dificuldade() throws IOException, InterruptedException {

        Scanner input = new Scanner(System.in);

        int dificuldade, forca;

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

        System.out.println("Escolha sua heroína:");
        System.out.println("1. Cavaleira");
        System.out.println("2. Feiticeira");
        System.out.println("3. Arqueira");

        int opcaoHeroina = input.nextInt();

//        int vidaInicial = 0;
//        int forcaInicial = 0;
//
//
//        switch (dificuldade) {
//            case 1: // Fácil
//                vidaInicial = 300;
//                forcaInicial = 60;
//
//                return new Cavaleira("Xena", dificuldade,)
//                break;
//            case 2: // Difícil
//                vidaInicial = 220;
//                forcaInicial = 40;
//                break;
//            default:
//                System.out.println("Opção de dificuldade inválida!");
//                break;
//        }
//
//        Heroinas heroinaEscolhida1 = heroinaEscolhida;
//        public static Heroinas heroinaEscolhida(Heroinas heroinaEscolhida){
//
//
//
//        }









        //Set de vida Máxima
        heroina.setVidaMax(pontosIniciais);


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


        switch (opcao) {

            case 1:
                System.out.println("**** CAVALEIRA SELECIONADA ****");
                System.out.println();
                if (dificuldade == 1) {
                    int vidaMax = heroina.setVidaMax(300);
                    int forca_Facil = heroina.setForca(forca);
                    System.out.println("Sua força total é: " + forca_Facil + "pw");
                    int moeda_facil = 80;
                    System.out.println("Total de moedas: " + 80 + "diñero");
                    int vida_Facil = heroina.setVidaAtual(vidaMax - forca);
                    System.out.println("Total de Vida: " + vida_Facil + "pts");
                    Heroinas tipoHeroina = new Cavaleira("JoanaDark", vidaMax, vida_Facil, forca_Facil, 1, moeda_facil);
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro(tipoHeroina);

                } else if (dificuldade == 2) {
                    int vidaMax = heroina.setVidaMax(220);
                    int forca_Dificil = heroina.setForca(forca);
                    System.out.println("Sua força total é: " + forca_Dificil + "pw");
                    int moedas_dificil = 40;
                    System.out.println("Total de moedas: " + moedas_dificil + "diñero");
                    int vida_Dificil = heroina.setVidaAtual(vidaMax - forca);
                    System.out.println("Total de Vida: " + vida_Dificil + "pts");
                    Heroinas tipoHeroina = new Cavaleira("JoanaDark", vidaMax, vida_Dificil, forca_Dificil, 1, moedas_dificil);
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro(tipoHeroina);

                } else {

                    System.out.println("Opção invalida");
                }


                break;
            case 2:
                System.out.println("**** FEITICEIRA SELECIONADA ****");
                System.out.println();
                if (dificuldade == 1) {

                    int vidaMax = heroina.setVidaMax(300);
                    int forca_Facil = heroina.setForca(forca);
                    System.out.println("Sua força total é: " + forca_Facil + "pw");
                    int moedas_Facil = 80;
                    System.out.println("Total de moedas: " + moedas_Facil + "diñero");
                    int vida_Facil = heroina.setVidaAtual(vidaMax - forca);
                    System.out.println("Total de Vida: " + vida_Facil + "pts");
                    Heroinas tipoHeroina1 = new Feiticeira("Sabrina", vidaMax, vida_Facil, forca_Facil, 1, moedas_Facil);
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro(tipoHeroina1);

                } else if (dificuldade == 2) {
                    int vidaMax = heroina.setVidaMax(220);
                    int forca_Dificil = heroina.setForca(forca);
                    System.out.println("Sua força total é: " + forca_Dificil + "pw");
                    int moedas_dificil = 40;
                    System.out.println("Total de moedas: " + moedas_dificil + "diñero");
                    int vida_Dificil = heroina.setVidaAtual(vidaMax - forca);
                    System.out.println("Total de Vida: " + vida_Dificil + "pts");
                    Heroinas tipoHeroina1 = new Feiticeira("Sabrina", vidaMax, vida_Dificil, forca_Dificil, 1, moedas_dificil);
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro(tipoHeroina1);

                } else {

                    System.out.println("Opção invalida");

                }

                break;
            case 3:
                System.out.println("**** ARQUEIRA SELECIONADA ****");
                System.out.println();

                if (dificuldade == 1) {
                    int vidaMax = heroina.setVidaMax(300);
                    int forca_Facil = heroina.setForca(forca);
                    System.out.println("Sua força total é: " + forca_Facil + "pw");
                    int moedas_Facil = 80;
                    System.out.println("Total de moedas: " + moedas_Facil + "diñero");
                    int vida_Facil = heroina.setVidaAtual(vidaMax - forca);
                    System.out.println("Total de Vida: " + vida_Facil + "pts");
                    Heroinas tipoHeroina3 = new Arqueira("Xena", vidaMax, vida_Facil, forca_Facil, 1, moedas_Facil);
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro(tipoHeroina3);

                } else if (dificuldade == 2) {
                    int vidaMax = heroina.setVidaMax(220);
                    int forca_Dificil = heroina.setForca(forca);
                    System.out.println("Sua força total é: " + forca_Dificil + "pw");
                    int moedas_dificil = 40;
                    System.out.println("Total de moedas: " + moedas_dificil + "diñero");
                    int vida_Dificil = heroina.setVidaAtual(vidaMax - forca);
                    System.out.println("Total de Vida: " + vida_Dificil + "pts");
                    Heroinas tipoHeroina3 = new Arqueira("Xena", vidaMax, vida_Dificil, forca_Dificil, 1, moedas_dificil);
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro(tipoHeroina3);

                } else {

                    System.out.println("Opção invalida");
                }

                break;

            default:
                System.out.println("Opção inválida");

        }

    }
}




