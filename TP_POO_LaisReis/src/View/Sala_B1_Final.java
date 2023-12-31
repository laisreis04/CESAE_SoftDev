package View;

import Domain.Jogo;

import java.io.IOException;
import java.util.Scanner;

public class Sala_B1_Final {

    public void menu_B1_Final() throws IOException {

        Scanner input = new Scanner(System.in);

        int opcao;

        System.out.println("Oh no! O cavaleiro era um templário, e ele te enganou! Você perdeu todos os seu pontos!\n");
        System.out.println("Quer jogar novamente?");
        System.out.println("1. SIM - Com a mesma personagem");
        System.out.println("2. SIM -Uma nova jogadora");
        System.out.println("3. NÃO - Sair");
        opcao = input.nextInt();

        switch (opcao){

            case 1:
                Menu_EncontroBruxaViajente.menuPrimeiroEncontro();
                break;
            case 2:
                Jogo escolhaPersonagem = new Jogo();
                escolhaPersonagem.criarPersonagem();
                break;
            case 3:
                Menu_Inicial.MenuInicial();
                break;
            default:
                System.out.println("Opção Inválida");



        }


    }



}
