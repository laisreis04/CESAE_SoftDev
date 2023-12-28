package Domain.Heroina;

import Domain.Itens.ArmaPrincipal;
import Domain.Itens.Consumiveis;

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


    //SETTERS
    public int setMoedas(int moedas) {
        this.moedas = moedas;
        return moedas;
    }

    public void setArmas(ArmaPrincipal armas) {
        this.armas = armas;
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

    /**
     * Método obrigatório para todas as heroinas para usar poção e restuarar a vida e força
     */
    public abstract void usarPocao();

    // metodo atacar

}
