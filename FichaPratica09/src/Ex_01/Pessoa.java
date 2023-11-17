package Ex_01;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    //construtor

    /**
     * Método construtor de pessoa
     *
     * @param nome
     * @param idade
     * @param altura
     */
    Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}