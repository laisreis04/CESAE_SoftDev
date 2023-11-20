package Ex_02;

public class Cao {

    private String nome;
    private String raca;
    private String latido;

    /**
     * Método construtor do cão (Nome e raça)
     *
     * @param nome
     * @param raca
     */
    public Cao(String nome, String raca, String latido) {
        this.nome = nome;
        this.raca = raca;
        this.latido = "au au au";

    }

    /**
     * Get
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void latir(){
        System.out.println(this.latido);
    }

    /**
     * Set Latido
     * @param latido
     */


}
