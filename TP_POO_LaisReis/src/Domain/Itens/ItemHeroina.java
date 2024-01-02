package Domain.Itens;

import Repository.WitchStoreRepository;

import java.util.ArrayList;

public  abstract class ItemHeroina {

    String nome;

    int precoItem;

    private int forca;

    private int vida;
    private int ataque;


    private ArrayList<String> heroinaPermitida;


    public ItemHeroina(String nome, int precoItem) {
        this.nome = nome;
        this.precoItem = precoItem;
        this.heroinaPermitida = new ArrayList<>();
    }



    /**
     * Método para adicionar Heroina
     * @param heroinaNova - Recebe a heroina
     */
    public void addHeroinas(String heroinaNova) {
        this.heroinaPermitida.add(heroinaNova);

    }

    public int getForca() {
        return forca;
    }

    public int getVida() {
        return vida;
    }

    public String getNome() {
        return nome;
    }

    public int getPrecoItem() {
        return precoItem;
    }

    public ArrayList<String> getHeroinaPertitida() {
        return heroinaPermitida;
    }


    //Exibir detalhes
    public void exibirDetalhes (){
        System.out.print("Nome: " + this.nome + " \n" );
        System.out.print("Preço: " + precoItem + " \n\t");
        System.out.print("Heroínas  Permitidas: "+this.heroinaPermitida + "\n");


    }




}
