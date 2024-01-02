package Controllers;

import Domain.Heroina.Heroinas;
import Domain.Heroina.NPC;
import View.Sala_B1_Final;
import View.Sala_B2;

import java.io.IOException;
import java.util.Random;

public class CavaleiroController {

    public void decisao_Cavaleiro() throws IOException, InterruptedException {


        //Segundo Random, agora quem decide o caminho é o cavaleiro
        Random random = new Random();


        //Há 50% de chance de dar bom
        int ramdonNum = random.nextInt(1, 50);



        System.out.println("..... (¯`v´¯)♥\n" +
                ".......•.¸.•´\n" +
                "....¸.•´\n" +
                "... (\n" +
                "☻/\n" +
                "/▌♥♥\n" +
                "/ \\ ♥♥");


        if (ramdonNum <= 25) {


            System.out.println("* ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►** ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►** ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►*\n");

            System.out.println("Sem que você tenha apercebido o Cavaleiro escolheu o proximo caminho.....\n");

            System.out.println("O cavaleiro, movido por uma intensa convicção, escolhe a primeira sala. Ao adentrar, uma atmosfera de tensão envolve-os rapidamente.\n " +
                    "Uma discussão se inicia, e as palavras ásperas que são trocadas desencadeiam uma briga intensa entre a heroína e o cavaleiro.\n" +
                    "\n" +
                    "Infelizmente, durante a acalorada discussão, um desentendimento profundo se instaura, e a heroína acaba perdendo mais pontos de força e vitalidade, além de,\n " +
                    "infelizmente, perder a vida na batalha emocional e física que se desenrolou entre os dois.\n" +
                    "\n" +
                    "A cena fica permeada por um sentimento de tristeza e perda, lembrando a fragilidade das relações e o preço muitas vezes alto das discordâncias.\n");
            System.out.println();

            //Sala para a escolha random - pode ganhar ou perder (Vai para o game over)
            Sala_B1_Final salaB1Final = new Sala_B1_Final();
            salaB1Final.menu_B1_Final();

        } else if (ramdonNum > 25) {


            System.out.println("Sem que você tenha apercebido o Cavaleiro escolhei o proximo caminho.....\n");
            System.out.println("O cavaleiro, sem hesitar, escolhe o segundo caminho. No entanto, ao adentrarem, algo peculiar acontece. \n" +
                    "A heroína, sentindo-se profundamente perturbada pela perda momentânea de controle sobre a situação, é tomada por uma ira intensa.\n" +
                    "\n");


            //Indicar sala para o proximo cenário
            //Sala B2 - ataque ao cavaleiro
            Sala_B2 salaB2 = new Sala_B2();
            salaB2.ataqueAoCavaleiroMentiroso();


        }

    }
}
