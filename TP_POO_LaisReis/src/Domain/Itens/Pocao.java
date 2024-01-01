package Domain.Itens;

import Domain.Itens.Consumiveis;
import Repository.WitchStoreRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

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

    public void exibir_Detalhes_pocao(){


            System.out.println("Vida= " + vida);
        System.out.println("Força = " + forca);

    }

}
