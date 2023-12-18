package Domain;

import Domain.WitchStore.ArmaPrincipal;
import Domain.WitchStore.Consumiveis;

import java.util.ArrayList;

public abstract class Heroinas extends Entidade {

    private int nivel;
    private int moedas;
    private ArmaPrincipal armas;
    private ArrayList<Consumiveis> inventario;

    public Heroinas(String nome, int vidaMax, int vidaAtual, int forca, int nivel, int moedas, ArmaPrincipal armas, ArrayList<Consumiveis> inventario) {
        super(nome, vidaMax, vidaAtual, forca);
        this.nivel = nivel;
        this.moedas = moedas;
        this.armas = armas;
        this.inventario = inventario;
    }

    /**
     * Método para atacar um NPC
     * @param inimigo
     */
    public abstract void ataqueNPC(NPC inimigo);

    // usarPocao - imprimir os detalhes da pocao e perguntar qualquer usar + incrmentar vida e força

    // metodo atacar

}
