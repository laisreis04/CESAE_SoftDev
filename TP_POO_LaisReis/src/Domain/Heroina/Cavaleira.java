package Domain.Heroina;

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
    public String ataqueNPC(NPC inimigo) {

        // Inimigo ataca primeiro
        int danoInimigo = (int) (inimigo.getForca() * 0.8); // Apenas 80% da força inicial do inimigo

        // Calcula dano no cavaleiro
        int danoHeroina = inimigo.atacar(danoInimigo); // Reduz a vida do cavaleiro

        // dano nas personagens
        //Inimigo:
        int inimigoTotal = inimigo.setVidaAtual(inimigo.getVidaAtual() - danoInimigo);

        //Heroina:
        int heroinaVidaTotal = setVidaAtual(getVidaAtual() - danoHeroina);
        setForca(getForca() - danoInimigo);


        if(heroinaVidaTotal > inimigoTotal){
            return String.valueOf(heroinaVidaTotal);

        }


        return String.valueOf(danoInimigo);

    }



}
