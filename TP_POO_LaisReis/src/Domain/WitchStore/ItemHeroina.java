package Domain.WitchStore;

import java.util.ArrayList;

public  abstract class ItemHeroina {

    private String nome;

    private int ouro;

    private int precoItem;

    private ArrayList<String> minhaHeroina;


    public ItemHeroina(String nome, int ouro, int precoItem) {
        this.nome = nome;
        this.ouro = ouro;
        this.precoItem = precoItem;
        this.minhaHeroina = ArrayList<>();
    }


    public void addHeroinas(String heroinaAtual) {
    }


    //Exibir detalhes

}
