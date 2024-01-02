package View;

import Controllers.CavaleiroController;
import Domain.Heroina.Entidade;
import Domain.Heroina.Heroinas;
import Domain.Itens.ItemHeroina;
import Repository.WitchStoreRepository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Sala_B {


public static void salaB() throws IOException, InterruptedException {

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



        System.out.println("* ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►** ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►** ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►*\n");

        System.out.println("A Guerreira " + heroina.getNome() + " encontoru um cavaleiro, e juntos foram pelos trilhos Vila Chã\n");

        System.out.println("Ao longo das muitas jornadas, batalhas épicas e momentos de perigo, a heroína e o cavaleiro forjaram um vínculo indomável.\n" +
                "Juntas, elas enfrentaram inúmeras adversidades e desafios, criando uma ligação que transcendia o tempo e a distância.\n" +
                "\n" +
                "Agora, encontram-se no cume de uma montanha majestosa, envoltas pela névoa e pelo silêncio imponente que domina a paisagem. " +
                "O vento sussurra segredos antigos, e a jornada delas as conduziu a este ponto crucial.\n" +
                "\n" +
                "A heroína percebe que chegou o momento de tomar uma decisão que moldará o curso de suas vidas. No entanto, antes que ela possa expressar suas ponderações sobre os \n" +
                "caminhos à sua frente, é o cavaleiro que se aproxima, fitando-a com olhos determinados e serenos.\n" +
                "\n" +
                "\"Minha valente companheira de batalhas\", diz o cavaleiro, a voz ecoando na serenidade do ambiente, \"agora é a \n" +
                "minha vez de conduzir nosso destino por um momento. Este é o momento em que o destino nos presenteia com uma encruzilhada.\"\n" +
                "\n" +
                "A heroína, sentindo-se surpreendida pela mudança repentina na dinâmica, aguarda, mas seu desconforto é evidente. " +
                "O cavaleiro explica que, diante delas, há dois caminhos distintos, cada um carregando sua própria promessa e desafio. Um leva às terras proibidas,\n " +
                "onde lendas antigas falam de tesouros inestimáveis e segredos ocultos. O outro, por sua vez, leva a uma floresta encantada, onde a sabedoria dos ancestrais se\n " +
                "diz estar à espera daqueles corajosos o suficiente para buscá-la.\n" +
                "\n" +
                "\"Por que não?\" murmura a heroína consigo mesma, enquanto se vê momentaneamente afastada da liderança da decisão. \n" +
                "Ela olha nos olhos do cavaleiro, sentindo um desequilíbrio momentâneo.\n" +
                "\n" +
                "O cavaleiro, sem perceber totalmente a perturbação da heroína, aguarda sua resposta, confiante de sua escolha.\n" +
                "\n" +
                "E agora, diante da expectativa, o cavaleiro decide o próximo passo nessa jornada extraordinária. No entanto, a heroína, embora \n" +
                "continue seguindo adiante, sente um abalo interior, uma perda momentânea de força e vitalidade, percebendo que seu próprio poder foi temporariamente diminuído.\n");

        System.out.println();

        System.out.println("Perdeu 80pw de Força | E 50pt de Vida.");


        System.out.println("* ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►** ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►** ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►*");
        System.out.println("\nForça: " + heroina.setForca(heroina.getForca()) + "\nVida: " + heroina.setVidaAtual(heroina.getVidaAtual()));
        System.out.println("* ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►** ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►** ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►*");

    System.out.println("Prepare-se agora quem toma as decisões é o Cavaleiro");


        sleep(1000);
    System.out.println("1...");
    sleep(1000);
    System.out.println("2...");
    sleep(1000);
    System.out.println("3...");
    sleep(1000);
    System.out.println("4...");
    sleep(1000);
    System.out.println("5...");
    sleep(1000);
    System.out.println("6...");
    sleep(1000);
    System.out.println("7...");
    sleep(1000);
    System.out.println("8...");
    sleep(1000);
    System.out.println("9...");
    sleep(1000);
    System.out.println("10...");


        CavaleiroController cavaleiroNamoro = new CavaleiroController();
        cavaleiroNamoro.decisao_Cavaleiro();
    }

}
