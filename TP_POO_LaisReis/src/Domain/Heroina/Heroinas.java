package Domain.Heroina;

import Domain.Itens.ArmaPrincipal;
import Domain.Itens.Consumiveis;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Heroinas extends Entidade {

    protected int nivel;
    protected int moedas;
    protected ArmaPrincipal armas;
    protected ArrayList<Consumiveis> inventario;

    public Heroinas(String nome, int vidaMax, int vidaAtual, int forca, int nivel, int moedas) {
        super(nome, vidaMax, vidaAtual, forca);
        this.nivel = nivel;
        this.moedas = moedas;
        this.armas = null;
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

    public void adicionar_Invetario(Consumiveis itemNovo) throws IOException {

        this.inventario.add(itemNovo);

    }

    /**
     * Método para atacar um NPC
     *
     * @param inimigo
     * @return
     */
    public abstract String ataqueNPC(NPC inimigo) throws IOException, InterruptedException;
}


