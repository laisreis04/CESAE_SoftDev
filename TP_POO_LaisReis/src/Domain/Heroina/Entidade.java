package Domain.Heroina;

public abstract class  Entidade {


    //Esse é a classe para criar a personagem central
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

    public Entidade() {

    }

    //Elaborar métodos:


    //Exibir detalhes();

    /**
     * Método para exibir detlahes da Heroína
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

    public String getNome() {
        return nome;
    }

    public int setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
        return vidaAtual;
    }

    public int setForca(int forca) {
        this.forca = forca;
        return forca;
    }
}
