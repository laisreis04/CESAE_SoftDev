package Domain.Itens;

public class Pocao extends Consumiveis {

    private int vida;

    private int forca;


    public Pocao(String nome, int precoItem, int vida, int forca) {
        super(nome, precoItem);
        this.vida = vida;
        this.forca = forca;
    }

    public Pocao(int vida, int forca) {
        super(String.valueOf(vida), forca);
    }


    public int getVida() {
        return vida;
    }

    public int getForca() {
        return forca;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

public void exibirVida_Forca(){

    System.out.println("Sua vida: " + this.vida);
    System.out.println("Sua Força: " + forca);

}

    }
