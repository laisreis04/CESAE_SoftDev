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
        this.latido = latido;

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

    public String getLatido() {
        return latido;
    }

    /**
     * Set Latido
     * @param latido
     */

    public void setLatido(String latido) {
        this.latido = latido;
    }
}
