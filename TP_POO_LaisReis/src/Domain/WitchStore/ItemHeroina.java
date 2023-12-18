package Domain.WitchStore;

import java.util.ArrayList;

public  abstract class ItemHeroina {

    private String nome;

    private int precoItem;

    private ArrayList<String> heroinaPermitida;


    public ItemHeroina(String nome,int precoItem) {
        this.nome = nome;
        this.precoItem = precoItem;
        this.heroinaPermitida = new ArrayList<>();
    }


    public void addHeroinas(String heroinaAtual) {
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

}
