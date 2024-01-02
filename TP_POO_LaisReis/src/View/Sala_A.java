package View;

import Domain.Heroina.Heroinas;
import Domain.Heroina.NPC;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Sala_A {

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


        Heroinas heroinaAtacando = new Heroinas() {
            @Override
            public String ataqueNPC(NPC inimigo) throws FileNotFoundException {
                return String.valueOf(inimigo);
            }
        };


        //método de ataque ao inimigo - Segue ataques diferente das diferentes classe, quando a heroina foi instaciada.
        NPC inimigoJuizes = new NPC("Juizes", 150,150,80,100);
        heroinaAtacando.ataqueNPC(inimigoJuizes);

        Sala_FInal.salaFinal();





    }




}
