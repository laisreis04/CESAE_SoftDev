package Domain.Itens;

import Domain.Itens.Consumiveis;

public class Pocao extends Consumiveis {

    private int vida;

    private int forca;

    public Pocao(String nome, int precoItem, int vida, int forca) {
        super(nome, precoItem);
        this.vida = vida;
        this.forca = forca;
    }

    public int getVida() {
        return vida;
    }

    public int getForca() {
        return forca;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    //Exibir Detalhes

}
