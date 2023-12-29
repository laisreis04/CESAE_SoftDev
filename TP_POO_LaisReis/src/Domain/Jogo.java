package Domain;

import Controllers.Points_DistributionController;
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
            Points_DistributionController dificuldade = new Points_DistributionController();
            dificuldade.parametros_Dificuldade();


            switch (opcao) {

                case 1:
                    System.out.println("**** CAVALEIRA SELECIONADA ****");
                    System.out.println();
                    Entidade tipoHeroina = new Cavaleira(nome, dificuldade.getVidaMax(), dificuldade.getVidaAtual(), dificuldade.getForca(), 1, dificuldade.getMoeda());
                    setHeroinaEscolhida((Heroinas) tipoHeroina);
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro();
                    break;
                case 2:
                    System.out.println("**** FEITICEIRA SELECIONADA ****");
                    System.out.println();
                    Entidade tipoHeroina1 = new Feiticeira(nome, dificuldade.getVidaMax(), dificuldade.getVidaAtual(), dificuldade.getForca(), 1, dificuldade.getMoeda());
                    setHeroinaEscolhida((Heroinas) tipoHeroina1);
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro();
                    break;
                case 3:
                    System.out.println("**** ARQEIRA SELECIONADA ****");
                    System.out.println();
                    Entidade tipoHeroina3 = new Arqueira(nome, dificuldade.getVidaMax(), dificuldade.getVidaAtual(), dificuldade.getForca(), 1, dificuldade.getMoeda());
                    setHeroinaEscolhida((Heroinas) tipoHeroina3);
                    Menu_EncontroBruxaViajente.menuPrimeiroEncontro();
                    break;

                default:
                    System.out.println("Opção inválida");

            }



    }
}
