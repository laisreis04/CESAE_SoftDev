package View;

import Domain.Heroina.*;

import java.io.IOException;
import java.util.Scanner;

public class Sala_A {

    public Sala_A() {
    }

    public static void menuSala_A() throws IOException, InterruptedException {


        System.out.println("A heroína, seguindo o caminho em direção ao Lago Verde, adentra uma paisagem serena e exuberante, \n" +
                "onde a natureza parece respirar em harmonia. No entanto, à beira do lago, encontra-se um grupo de juízes misteriosos, \n" +
                "vestidos com mantos ornamentados e olhares penetrantes.\n" +
                "\n" +
                "Os juízes, seres guardiões da natureza e da ordem, encaram a heroína com uma mistura de avaliação e inquirição. \n" +
                "Sem dizer uma palavra, suas presenças imponentes criam uma aura de expectativa no ar.\n" +
                "\n" +
                "De repente, um estrondo ecoa através da clareira enquanto a terra treme. Um ataque surpresa se desencadeia, vindo \n" +
                "de uma fonte desconhecida. A heroína, com sua agilidade e coragem, rapidamente se prepara para enfrentar essa nova ameaça.");





        Heroinas cavaleira = new Cavaleira();
        Heroinas feiticeira = new Feiticeira();
        Heroinas arqueira = new Arqueira();

        //método de ataque ao inimigo - Segue ataques diferente das diferentes classe, quando a heroina foi instaciada.
        NPC inimigoJuizes = new NPC("Juizes", 80,80,40,100);


        System.out.println("Começar a batalha?\n1. Sim\n2.Não");
        Scanner input = new Scanner(System.in);
        int opcao = input.nextInt();

        if(opcao == 1){
                feiticeira.ataqueNPC(inimigoJuizes);;
                cavaleira.ataqueNPC(inimigoJuizes);
                arqueira.ataqueNPC(inimigoJuizes);

        }else {
            Sala_FInal.salaFinal();
        }






    }




}
