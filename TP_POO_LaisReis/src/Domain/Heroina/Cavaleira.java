package Domain.Heroina;

import Domain.Itens.ArmaPrincipal;

public class Cavaleira extends Heroinas {

    public Cavaleira(String nome, int vidaMax, int vidaAtual, int forca, int nivel, int moedas, ArmaPrincipal armas) {
        super(nome, vidaMax, vidaAtual, forca, nivel, moedas, armas);
    }

    @Override
    public void ataqueNPC(NPC inimigo) {

    }


}
