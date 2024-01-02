package View;

import Domain.Heroina.Heroinas;
import Domain.Heroina.NPC;
import Domain.Jogo;
import Tools.TXTReader;

import java.io.IOException;
import java.util.Scanner;

public class Sala_B1_Final {

    public void menu_B1_Final() throws IOException, InterruptedException {

        Scanner input = new Scanner(System.in);

        int opcao;

        TXTReader.imprimirFicheiro("src/Files/GameOver");


        System.out.println();
        System.out.println("Infelizmente nem todas as heroinas por ai tem uma segunda chance...\n");
        System.out.println("Quer jogar novamente?");
        System.out.println("1. SIM - Com a mesma personagem");
        System.out.println("2. SIM -Uma nova jogadora");
        System.out.println("3. NÃO - Sair");
        opcao = input.nextInt();

        switch (opcao){

            case 1:
                Heroinas heroinaEscolhida = new Heroinas() {
                    @Override
                    public String ataqueNPC(NPC inimigo) {

                        return String.valueOf(inimigo);
                    }
                };
                Menu_EncontroBruxaViajente.menuPrimeiroEncontro(heroinaEscolhida);
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
