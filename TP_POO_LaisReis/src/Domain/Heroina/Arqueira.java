package Domain.Heroina;

import Domain.Itens.ArmaPrincipal;

public class Arqueira extends Heroinas{

    public Arqueira(String nome, int vidaMax, int vidaAtual, int forca, int nivel, int moedas) {
        super(nome, vidaMax, vidaAtual, forca, nivel, moedas);
    }


    public Arqueira() {

    }

    @Override
    public void ataqueNPC(NPC inimigo) {

    }


}
