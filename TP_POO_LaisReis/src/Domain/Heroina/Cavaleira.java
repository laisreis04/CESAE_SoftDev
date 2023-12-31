package Domain.Heroina;

import Domain.Itens.ArmaPrincipal;

public class Cavaleira extends Heroinas {

    public Cavaleira(String nome, int vidaMax, int vidaAtual, int forca, int nivel, int moedas) {
        super(nome, vidaMax, vidaAtual, forca, nivel, moedas);
    }



    public Cavaleira() {

    }

    @Override
    public void ataqueNPC(NPC inimigo) {

    }

//    @Override
////    public void ataqueNPC(NPC inimigo) {
////
////        if(inimigo)
////
////    }


}
