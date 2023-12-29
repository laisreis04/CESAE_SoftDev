package Domain.Heroina;

import Domain.Itens.ArmaPrincipal;

public class Feiticeira extends Heroinas{

    public Feiticeira(String nome, int vidaMax, int vidaAtual, int forca, int nivel, int moedas) {
        super(nome, vidaMax, vidaAtual, forca, nivel, moedas);
    }

    public Feiticeira(int i) {
    }

    public Feiticeira() {

    }

    @Override
    public void ataqueNPC(NPC inimigo) {

    }


}
