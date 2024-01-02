package Controllers;

import Domain.Heroina.Entidade;
import Domain.Heroina.Heroinas;
import Domain.Heroina.NPC;
import Domain.Itens.ItemHeroina;
import Repository.WitchStoreRepository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameController {


    private ArrayList<ItemHeroina> itensLoja;






    public GameController() throws FileNotFoundException{

        WitchStoreRepository repository = new WitchStoreRepository("src/Files/ItensHeroiRPG.csv");
        this.itensLoja = repository.getItensLista();

    }

    static Entidade heroina = new Entidade() {
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

    Heroinas heroinaEscolhida = new Heroinas() {
        @Override
        public String ataqueNPC(NPC inimigo) {

            return String.valueOf(inimigo);
        }
    };

    public int parametros_Dificuldade() throws IOException {

        Scanner input = new Scanner(System.in);

        int dificuldade, forca;

        System.out.println("1. Fácil, hoje eu tô de boas \n" +
                "(Pontos Iniciais: 300)\n\n");
        System.out.println("2. Dificil, preparadx para qualquer desafio!\n" +
                "(Pontos Iniciais: 220)\n\n");
        dificuldade = input.nextInt();

        //Opção de dificuldade
        int pontosIniciais = 0;
        if(dificuldade == 1){
            pontosIniciais = 300;
            System.out.println("Nível fácil escolhido\n\n");
        }else if (dificuldade == 2){
            pontosIniciais = 220;
            System.out.println("Nível difícil escolhido\n\n");
        }else {
            System.out.println("Opção inválida baby...\n\n");
        }


        System.out.println("Nem tudo são flores, temos que distribuir a sua força.\n" +
                "Mas como nem tudo são flores, fica a tabela de pontos:\n" +
                "1pw Força = 5 Pontos Iniciais");

        System.out.print("Força: ");
        forca  = input.nextInt() * 5;


        //Set de vida Máxima
        heroina.setVidaMax(pontosIniciais);


        if(dificuldade == 1){
            int vidaMax = heroina.setVidaMax(300);
            int forca_Facil = heroina.setForca(forca);
            System.out.println("Sua força total é: " + forca_Facil + "pw");
            int moedas_Facil =heroinaEscolhida.setMoedas(80);
            System.out.println("Total de moedas: " + moedas_Facil + "diñero");
            int vida_Facil = heroina.setVidaAtual(vidaMax - forca);
            System.out.println("Total de Vida: " + vida_Facil + "pts");

        } else if (dificuldade == 2) {
            int vidaMax = heroina.setVidaMax(220);
            int forca_Dificil = heroina.setForca(forca);
            System.out.println("Sua força total é: " + forca_Dificil + "pw");
            int moedas_dificil = heroinaEscolhida.setMoedas(40);
            System.out.println("Total de moedas: " + moedas_dificil + "diñero");
            int vida_Dificil = heroina.setVidaAtual(vidaMax - forca);
            System.out.println("Total de Vida: " + vida_Dificil + "pts");

        }else {

            System.out.println("Opção invalida");
        }

        return dificuldade;
    }


        public static int getVidaMax(){
        return heroina.getVidaMax();
        }

        public static int getForca(){
        return heroina.getForca();
        }

        public int getMoeda(){
        return heroinaEscolhida.getMoedas();
        }

        public static int getVidaAtual(){
        return  getVidaMax();
        }


public static void exibir_Vida_Forca(){

    System.out.println("Sua vida: " + getVidaAtual());
    System.out.println("Sua força: " + getForca());

}

}
