package Domain;

import Controllers.GameController;
import Domain.Heroina.*;
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

    public void setHeroinaEscolhida(Heroinas heroinaEscolhida) {
        this.heroinaEscolhida = heroinaEscolhida;
    }

    public void criarPersonagem() throws IOException {

        Scanner input = new Scanner(System.in);


        String nome;

        System.out.println();
        System.out.println("Vamos montar a sua Guerreira");


        //Nome
        System.out.println("Qual vai ser o nome dela? ");
        nome = input.next();
        setNomeHeroina(nome);
        System.out.println();

        //Tipo de Heroina

        int opcao;



            System.out.println("****************************************");  //40*
            System.out.println("Que tipo de heroina quer ser?");
            System.out.println();

            System.out.println("1. Cavaleira");
            System.out.println("2. Feiticeira");
            System.out.println("3. Arqueira");
            opcao = input.nextInt();
            System.out.println();

            //Dificuldade
            System.out.println("****************************************");  //40*
            System.out.println("Qual o nível de dificuldade?\n");
            GameController dificuldade = new GameController();
            dificuldade.parametros_Dificuldade();


            switch (opcao) {

                case 1:
                    System.out.println("**** CAVALEIRA SELECIONADA ****");
                    System.out.println();
                    Heroinas tipoHeroina = new Cavaleira(nome, dificuldade.getVidaMax(), dificuldade.getVidaAtual(), dificuldade.getForca(), 1, dificuldade.getMoeda());
                    setHeroinaEscolhida(tipoHeroina);
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro();
                    break;
                case 2:
                    System.out.println("**** FEITICEIRA SELECIONADA ****");
                    System.out.println();
                    Heroinas tipoHeroina1 = new Feiticeira(nome, dificuldade.getVidaMax(), dificuldade.getVidaAtual(), dificuldade.getForca(), 1, dificuldade.getMoeda());
                    setHeroinaEscolhida(tipoHeroina1);
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro();
                    break;
                case 3:
                    System.out.println("**** ARQEIRA SELECIONADA ****");
                    System.out.println();
                    Heroinas tipoHeroina3 = new Arqueira(nome, dificuldade.getVidaMax(), dificuldade.getVidaAtual(), dificuldade.getForca(), 1, dificuldade.getMoeda());
                    setHeroinaEscolhida(tipoHeroina3);
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro();
                    break;

                default:
                    System.out.println("Opção inválida");

            }



    }

    public void proxima_Missão()throws FileNotFoundException{


            Scanner input = new Scanner(System.in);

            int opcao;

            System.out.println("Você pode escolher entra dois caminhos:\n");
            System.out.println("1. Encontro com os Juízes:\n" +
                    "\n" +
                    "Neste caminho, nossa heroína enfrenta os Juízes, figuras poderosas e implacáveis. " +
                    "Ela usará suas habilidades e astúcia para desafiar a autoridade opressora e libertar as bruxas aprisionadas. Cada desafio vencido fortalecerá sua determinação, " +
                    "mas também aumentará a intensidade da perseguição contra ela.");
            System.out.println("2. Encontro amoroso com o Cavaleiro:\n" +
                    "\n" +
                    "Nesta opção, nossa heroína se envolve romanticamente com um Cavaleiro, uma aliança perigosa e proibida. " +
                    "O romance traz prazer, mas também implica riscos. A jornada amorosa afetará a missão principal, adicionando uma camada de complexidade emocional. " +
                    "No entanto, cada passo desse relacionamento desviará a atenção da missão, diminuindo a eficácia da luta contra os opressores.");

            opcao = input.nextInt();


            switch (opcao){

                case 1:

            }

        }

    }

