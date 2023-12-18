package Domain;

public abstract class  Entidade {

    private String nome;

    private int vidaMax;

    private int vidaAtual;

    private int forca;

    public Entidade(String nome, int vidaMax, int vidaAtual, int forca) {
        this.nome = nome;
        this.vidaMax = vidaMax;
        this.vidaAtual = vidaAtual;
        this.forca = forca;
    }

    //Elaborar métodos:


    //Exibir detalhes();

    /**
     * Método para Imprimir os Itens da Loja
     */
    protected void exibirDetalhesEntidade(){

        System.out.print("Nome: " + nome);
        System.out.println("Total de vida: " + vidaMax);
        System.out.println("Vida atual: " + vidaAtual);
        System.out.println("Sua força gata: " + forca);


    }

    public int getVidaMax() {
        return vidaMax = vidaAtual;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getForca() {
        return forca;
    }


    //Vida máx = vida Atual();


}
