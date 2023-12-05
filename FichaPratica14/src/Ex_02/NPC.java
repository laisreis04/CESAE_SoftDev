package Ex_02;

import Ex_02.ENUM.Categoria;

public class NPC extends Entidade{

    public NPC(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }

    @Override
    public void atacar(Entidade personagem) {
    int porrada = this.getForca();
    personagem.receberPorrada(porrada);
    }


}
