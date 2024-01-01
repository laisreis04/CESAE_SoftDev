package Domain.Heroina;

import Domain.Itens.ArmaPrincipal;

public class Cavaleira extends Heroinas {

    public Cavaleira(String nome, int vidaMax, int vidaAtual, int forca, int nivel, int moedas) {
        super(nome, vidaMax, vidaAtual, forca, nivel, moedas);
    }

    @Override
    public String toString() {
        return "Cavaleira{" +
                "inventario=" + inventario +
                '}';
    }

    public Cavaleira() {

    }

    @Override
    public void ataqueNPC(NPC inimigo) {

        Cavaleira cavaleiraLutando = new Cavaleira();

        if(cavaleiraLutando.getForca() > inimigo.getForca()){
            cavaleiraLutando.setForca(cavaleiraLutando.getForca() - (int) (inimigo.getForca() * 0.8));
        } else if (cavaleiraLutando.getForca() <= inimigo.getForca()) {
            inimigo.setForca(inimigo.getForca() - 50);
        }

    }



}
