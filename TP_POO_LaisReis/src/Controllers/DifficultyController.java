package Controllers;

import Domain.Heroina.Entidade;
import Domain.Heroina.Heroinas;
import Domain.Itens.ItemHeroina;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DifficultyController {


    private ArrayList<ItemHeroina> itensLoja;

    private Heroinas heroinaEscolhida;

    private Entidade entidadeEscolhida;

    public DifficultyController(Heroinas heroinaEscolhida) {
        this.heroinaEscolhida = heroinaEscolhida;
    }

    public int parametros_Dificuldade()throws FileNotFoundException {

        System.out.println("1. Fácil, hoje eu tô de boas \n" +
                "(Pontos Iniciais: 300)");
        System.out.println("2. Dificil, preparadx para qualquer desafio!\n" +
                "(Pontos Iniciais: 220");

        Scanner input = new Scanner(System.in);

        int dificuldade, forca;


        dificuldade = input.nextInt();
        System.out.println("Nem tudo são flores, temos que distribuir a sua força.\n" +
                "mas como tudo nessa vida nada é gratuito , fica a tabela de pontos:\n" +
                        "Força  \t Pontos\n01 \t 05\n");

        forca  = input.nextInt();

        if(dificuldade == 1){
           int pontosIniciais = 300;
            int setForca_Facil = entidadeEscolhida.setForca(pontosIniciais - forca);
            int setMoeda_Facil = heroinaEscolhida.setMoedas(20);
            int setVida_Facil = entidadeEscolhida.setVidaAtual(pontosIniciais - setForca_Facil);

        } else if (dificuldade == 2) {
            int pontosIniciais = 220;
            int setForca = entidadeEscolhida.setForca(pontosIniciais - forca);
            int setMoeda = heroinaEscolhida.setMoedas(15);
            int setVida = entidadeEscolhida.setVidaAtual(pontosIniciais - setForca);

        }else {
            System.out.println("Opção invalida");
        }

        return dificuldade;
    }



}
