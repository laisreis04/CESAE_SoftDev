package Domain.WitchStore;

import Domain.WitchStore.Consumiveis;

public class Pocao extends Consumiveis {

    private int vida;

    private int forca;

    public Pocao(String nome, int precoItem, int vida, int forca) {
        super(nome, precoItem);
        this.vida = vida;
        this.forca = forca;
    }

    //Exibir Detalhes

}
