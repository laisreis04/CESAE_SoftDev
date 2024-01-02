package Domain.Heroina;

public class NPC extends Entidade{

    private int moedas;

    public NPC(String nome, int vidaMax, int vidaAtual, int forca, int moedas) {
        super(nome, vidaMax, vidaAtual, forca);
        this.moedas = moedas;
    }

    public int getMoedas() {
        return moedas;
    }

    // método ataque

    public int atacar(int golpeRecebido){

        int danoTotal = 0;
        danoTotal -= golpeRecebido;
        return danoTotal;
    }

}
