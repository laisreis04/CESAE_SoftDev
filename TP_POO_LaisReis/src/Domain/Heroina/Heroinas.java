package Domain.Heroina;

import Domain.Itens.ArmaPrincipal;
import Domain.Itens.Consumiveis;
import Domain.Itens.ItemHeroina;

import java.util.ArrayList;

public abstract class Heroinas extends Entidade {

    protected int nivel;
    protected int moedas;
    protected ArmaPrincipal armas;
    protected ArrayList<Consumiveis> inventario;

    public Heroinas(String nome, int vidaMax, int vidaAtual, int forca, int nivel, int moedas, ArmaPrincipal armas) {
        super(nome, vidaMax, vidaAtual, forca);
        this.nivel = nivel;
        this.moedas = moedas;
        this.armas = armas;
        this.inventario = new ArrayList<>();
    }

    public int getNivel() {
        return nivel;
    }

    public int getMoedas() {
        return moedas;
    }

    public ArmaPrincipal getArmas() {
        return armas;
    }

    public ArrayList<Consumiveis> getInventario() {
        return inventario;
    }

public void adiconar_Invetario(Consumiveis itemNovo){

    this.inventario.add(itemNovo);
    }

    /**
     * Método para atacar um NPC
     * @param inimigo
     */
    public abstract void ataqueNPC(NPC inimigo);

    // usarPocao - imprimir os detalhes da pocao e perguntar qualquer usar + incrmentar vida e força

    // metodo atacar

}
