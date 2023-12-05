package Ex_02;

public abstract class Entidade {

    private String nome;
    private int vida;
    private int forca;

    public Entidade(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public int getVida() {
        return vida;
    }

    public int getForca() {
        return forca;
    }

    public abstract void atacar(Entidade adversario);

    public void receberPorrada(int porrada){
        vida -= porrada;

    }
}
