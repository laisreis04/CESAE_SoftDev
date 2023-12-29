package Controllers;

import Domain.Heroina.Cavaleira;
import Domain.Heroina.Entidade;
import Domain.Heroina.Heroinas;
import Domain.Heroina.NPC;
import Domain.Itens.ItemHeroina;
import Repository.WitchStoreRepository;
import View.Menu_EncontroBruxaViajente;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Points_DistributionController {


    private ArrayList<ItemHeroina> itensLoja;



    public Points_DistributionController() throws FileNotFoundException{

        WitchStoreRepository repository = new WitchStoreRepository("src/Files/ItensHeroiRPG.csv");
        this.itensLoja = repository.getItensLista();

    }

    Entidade entidadeEscolhida = new Entidade() {
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
        public void ataqueNPC(NPC inimigo) {

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
        entidadeEscolhida.setVidaMax(pontosIniciais);


        if(dificuldade == 1){
            int forca_Facil = entidadeEscolhida.setForca(forca);
            System.out.println("Sua força total é: " + forca_Facil + "pw");
            int moedas_Facil = heroinaEscolhida.setMoedas(80);
            System.out.println("Total de moedas: " + moedas_Facil + "diñero");
            int vida_Facil = entidadeEscolhida.setVidaAtual(pontosIniciais - forca_Facil);
            System.out.println("Total de Vida: " + vida_Facil + "pts");

        } else if (dificuldade == 2) {
            int forca_Dificil = entidadeEscolhida.setForca(forca);
            System.out.println("Sua força total é: " + forca_Dificil + "pw");
            int moedas_dificil = heroinaEscolhida.setMoedas(40);
            System.out.println("Total de moedas: " + moedas_dificil + "diñero");
            int vida_Dificil = entidadeEscolhida.setVidaAtual(pontosIniciais - forca_Dificil);
            System.out.println("Total de Vida: " + vida_Dificil + "pts");

        }else {

            System.out.println("Opção invalida");
        }

        return dificuldade;
    }


        public int getVidaMax(){
        return entidadeEscolhida.getVidaMax();
        }

        public int getForca(){
        return entidadeEscolhida.getForca();
        }

        public int getMoeda(){
        return heroinaEscolhida.getMoedas();
        }

        public int getVidaAtual(){
        return  getVidaMax();
        }




}
