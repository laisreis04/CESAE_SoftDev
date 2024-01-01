package Controllers;

import Domain.Heroina.Entidade;
import Domain.Heroina.Heroinas;
import Domain.Heroina.NPC;
import View.Sala_B1_Final;

import java.io.IOException;
import java.util.Random;

public class CavaleiroController {

    public void decisao_Cavaleiro() throws IOException {


        //Segundo Random, agora quem decide o caminho é o cavaleiro
        Random random = new Random();
        int ramdonNum = random.nextInt(1,2);

        Heroinas heroinaJogando = new Heroinas() {
            @Override
            public void ataqueNPC(NPC inimigo) {

            }
        };

        System.out.println("..... (¯`v´¯)♥\n" +
                ".......•.¸.•´\n" +
                "....¸.•´\n" +
                "... (\n" +
                "☻/\n" +
                "/▌♥♥\n" +
                "/ \\ ♥♥");

        switch (ramdonNum){

            case 1:
                System.out.println("* ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►** ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►** ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►*\n");

                System.out.println("Sem que você tenha apercebido o Cavaleiro escolhei o proximo caminho.....\n");

                System.out.println("O cavaleiro, movido por uma intensa convicção, escolhe a primeira sala. Ao adentrar, uma atmosfera de tensão envolve-os rapidamente.\n " +
                        "Uma discussão se inicia, e as palavras ásperas que são trocadas desencadeiam uma briga intensa entre a heroína e o cavaleiro.\n" +
                        "\n" +
                        "Infelizmente, durante a acalorada discussão, um desentendimento profundo se instaura, e a heroína acaba perdendo mais pontos de força e vitalidade, além de,\n " +
                        "infelizmente, perder a vida na batalha emocional e física que se desenrolou entre os dois.\n" +
                        "\n" +
                        "A cena fica permeada por um sentimento de tristeza e perda, lembrando a fragilidade das relações e o preço muitas vezes alto das discordâncias.\n");
                System.out.println();
                Sala_B1_Final salaB1Final = new Sala_B1_Final();
                salaB1Final.menu_B1_Final();

                            break;
            case 2:
                System.out.println("Sem que você tenha apercebido o Cavaleiro escolhei o proximo caminho.....\n");
                System.out.println("O cavaleiro, sem hesitar, escolhe o segundo caminho. No entanto, ao adentrarem, algo peculiar acontece. \n" +
                        "A heroína, sentindo-se profundamente perturbada pela perda momentânea de controle sobre a situação, é tomada por uma ira intensa.\n" +
                        "\n" +
                        "Sem dar tempo para explicações, a heroína ataca o cavaleiro, surpreendendo-o com sua reação imprevisível. \n" +
                        "Uma breve luta se inicia entre eles, com a heroína canalizando sua frustração e indignação no confronto direto.\n" +
                        "\n" +
                        "A batalha interna e externa causa uma queda nos pontos de força e vitalidade de ambos, deixando um rastro de danos e confusão. \n" +
                        "Uma sensação de desapontamento paira sobre o ambiente, ressaltando a complexidade das emoções humanas diante de situações inesperadas.\n" +
                        "\n" +
                        "Ambas as opções refletem diferentes desdobramentos da história, trazendo à tona as consequências das escolhas e emoções intensas \n" +
                        "vividas pelos personagens.");
                Heroinas ataque = new Heroinas() {
                    @Override
                    public void ataqueNPC(NPC inimigo) {

                    }
                };
                NPC inimigo = new NPC("Cavaleiro Mentiroso", 150,50,120,80);
                ataque.ataqueNPC(inimigo);

                break;
        }








    }

}
