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

        Scanner input = new Scanner(System.in);

        int opcao;


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

        String nome;





            do{

                System.out.println("╔═.✵.══════════════════════════════════╗\n");
                System.out.println("Que tipo de heroina quer ser?");
                System.out.println();

                System.out.println("1. Cavaleira");
                System.out.println("2. Feiticeira");
                System.out.println("3. Arqueira");
                System.out.println("0. Sair");
                opcao = input.nextInt();
                System.out.println();
                System.out.println("╚════════════════════════════════.✵.═╝");  //40*

                //Dificuldade
                System.out.println("╔═.✵.══════════════════════════════════╗\n");
                System.out.println("Qual o nível de dificuldade?\n");
                GameController dificuldade = new GameController();
                dificuldade.parametros_Dificuldade();
                System.out.println("╚════════════════════════════════.✵.═╝");  //40*


                switch (opcao) {

                    case 1:
                        System.out.println("**** CAVALEIRA SELECIONADA ****");
                        System.out.println();
                        Heroinas tipoHeroina = new Cavaleira("Xena", dificuldade.getVidaMax(), dificuldade.getVidaAtual(), dificuldade.getForca(), 1, dificuldade.getMoeda());
                        Menu_EncontroBruxaViajente.menuPrimeiroEncontro(setHeroinaEscolhida(tipoHeroina));
                        break;
                    case 2:
                        System.out.println("**** FEITICEIRA SELECIONADA ****");
                        System.out.println();
                        Heroinas tipoHeroina1 = new Feiticeira("Sabrina", dificuldade.getVidaMax(), dificuldade.getVidaAtual(), dificuldade.getForca(), 1, dificuldade.getMoeda());
                        Menu_EncontroBruxaViajente.menuPrimeiroEncontro(setHeroinaEscolhida(tipoHeroina1));
                        break;
                    case 3:
                        System.out.println("**** ARQUEIRA SELECIONADA ****");
                        System.out.println();
                        Heroinas tipoHeroina3 = new Arqueira("nome", dificuldade.getVidaMax(), dificuldade.getVidaAtual(), dificuldade.getForca(), 1, dificuldade.getMoeda());
                        Menu_EncontroBruxaViajente.menuPrimeiroEncontro(setHeroinaEscolhida(tipoHeroina3));
                        break;

                    default:
                        System.out.println("Opção inválida");

                }

            }while (opcao != 0);






    }




    }

