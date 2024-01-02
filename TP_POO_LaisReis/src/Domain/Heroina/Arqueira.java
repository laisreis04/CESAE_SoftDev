package Domain.Heroina;

import java.io.FileNotFoundException;

public class Arqueira extends Heroinas{

    public Arqueira(String nome, int vidaMax, int vidaAtual, int forca, int nivel, int moedas) {
        super(nome, vidaMax, vidaAtual, forca, nivel, moedas);
    }


    public Arqueira() {

    }

    @Override
    public int ataqueNPC(NPC inimigo) throws FileNotFoundException {

        // Heroina ataca primeiro
        int danoHeroina = getForca() + getArmas().getAtaque();

        // dano no inimigo
        int danoInimigo = inimigo.atacar(danoHeroina);

        // // 10% a mais de dano do inimigo (100 + 10)
        int danoArqueira = (int) (inimigo.getForca() * 1.1);

        //Dano a heroina e inimigo
        setVidaAtual(getVidaAtual() - danoArqueira);
        //inimigo
        inimigo.setVidaAtual(inimigo.getVidaAtual() - danoInimigo);

        return danoHeroina;
    }


}
