package Domain.Heroina;

import java.io.FileNotFoundException;

public class Feiticeira extends Heroinas {

    public Feiticeira(String nome, int vidaMax, int vidaAtual, int forca, int nivel, int moedas) {
        super(nome, vidaMax, vidaAtual, forca, nivel, moedas);
    }

    public Feiticeira(int i) {
    }

    public Feiticeira() {

    }

    @Override
    public int ataqueNPC(NPC inimigo) throws FileNotFoundException {

        int ganhador = 0;

        while (getVidaAtual() == 0 || inimigo.getVidaAtual() == 0) {
            //Heroina ataca primero
            int danoHeroina = getForca() + getArmas().getAtaque();

            //Dano no inimigo
            int danoInimigo = inimigo.atacar(danoHeroina);

            //danos nas personagens
            inimigo.setVidaAtual(inimigo.getVidaAtual() - danoInimigo);
            //heroina
            int heroinaVidaTotal = setVidaAtual(getVidaAtual() - danoHeroina);

            if(heroinaVidaTotal > 0){
                int moedasHeroina = setMoedas(getMoedas() + inimigo.getMoedas());
                return  ganhador = heroinaVidaTotal;
            }else {
                return ganhador = inimigo.getVidaAtual();

            }

        }
        return ganhador;
        }


    }





