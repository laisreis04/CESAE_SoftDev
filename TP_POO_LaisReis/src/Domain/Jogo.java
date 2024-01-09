package Domain;

import Controllers.GameController;
import Domain.Heroina.*;
import Tools.TXTReader;
import View.Menu_EncontroBruxaViajente;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Jogo {

    private String nomeHeroina;

    private Heroinas heroinaEscolhida;


    public Jogo() {
        this.nomeHeroina = nomeHeroina;
        this.heroinaEscolhida = heroinaEscolhida;
    }

    public void setNomeHeroina(String nomeHeroina) {
        this.nomeHeroina = nomeHeroina;
    }

    public Heroinas setHeroinaEscolhida(Heroinas heroinaEscolhida) {
        this.heroinaEscolhida = heroinaEscolhida;
        return heroinaEscolhida;
    }


    /**
     * Método para criar Personagem (Força/Vida) e selecionar o toipo de Heroina (Cavaleira, arqiera ou feiticeira)
     * @throws IOException
     */
    public void criarPersonagem() throws IOException, InterruptedException {


        TXTReader.imprimirFicheiro("src/Files/Separador");

        System.out.println("Nos recônditos sombrios da vila de Salem, um vento gélido carrega murmúrios de medo e opressão. \n" +
                "A chama da superstição incendeia corações, transformando vizinhos em acusadores e amigos em vítimas. \n" +
                "A bruxaria, um sinônimo de poder e mistério, tornou-se uma sentença de morte.\n" +
                "\n" +
                "Eis que emerge nossa heroína, uma alma corajosa, destinada a desafiar o dogma opressor dos Templários, Inquisidores e Caçadores. \n" +
                "Ela é a voz das que estão silenciadas, a luz na escuridão, e sua missão é ousada: libertar as bruxas injustamente acusadas das garras da tirania.\n" +
                "\n" +
                "Na véspera da batalha, o destino aguarda sua escolha. \n" +
                "Diante de caminhos perigosos, tome decisões sábias, pois cada escolha moldará seu destino e o desfecho dessa jornada épica.\n" +
                "\n" +
                "Prepare-se para a aventura e a luta pela justiça, pois o destino de Salem está em suas mãos!\n");



        GameController criar = new GameController();
        criar.parametros_Dificuldade();

    }

    }

