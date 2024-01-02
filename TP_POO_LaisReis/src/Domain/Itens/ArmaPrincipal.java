package Domain.Itens;

import Repository.WitchStoreRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ArmaPrincipal extends ItemHeroina {


    private int ataque;
    private int ataqueEspecial;




    public ArmaPrincipal(String nome, int precoItem, int ataque, int ataqueEspecial) throws FileNotFoundException {
        super(nome, precoItem);
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;

    }



    public void imprimirDetalhes_ArmaPrincipal(){

        System.out.println("Sua arma Principal é : " + super.getNome() );

    }


    public int getAtaque() throws FileNotFoundException {


        return ataque;

    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }


}

