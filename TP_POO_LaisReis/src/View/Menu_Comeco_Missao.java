package View;

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

private ArrayList<ItemHeroina> lista;

    public Menu_Comeco_Missao() {

        this.lista = lista;
    }

    public void primeiraMissao() throws IOException {

        Scanner input = new Scanner(System.in);

        int opcao;


        System.out.println("* ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►** ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►** ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►*\n");
        System.out.println("Você pode escolher entra dois caminhos:\n");
        System.out.println("1. CAMINHO DO LAGO VERDE:\n");
        System.out.println("2. TRILHA VILA CHÃ:\n");
        System.out.println("3. VER VIDA E FORÇA");

        opcao = input.nextInt();
        Sala_B salaB = new Sala_B();

        switch (opcao){

            case 1:

                break;
            case 2:

                salaB.salaB();
                break;
            case 3:
                System.out.println("Escolher caminho:\n");
                System.out.println("1. CAMINHO DO LAGO VERDE:\n");
                System.out.println("2. TRILHA VILA CHÃ:\n");
                opcao = input.nextInt();
                if(opcao == 1){
                    //salaA

                } else {
                salaB.salaB();
            }

                break;

            default:
                System.out.println("Opção Inválida");

        }

    }

}
