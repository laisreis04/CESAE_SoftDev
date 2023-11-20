package Ex_08;

public class Aluno {

    private String nome;
    private int idade;
    private String curso;
    private double media;

    public Aluno(String nome, int idade, String curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;
    }

    public void exbirDetalhesAluno(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Curso: " + this.curso);
        System.out.println("Média: " + this.media);

    }

    /**
     * Método para verificar se foi ou não aprovado
     */
    public void situacao(){
        if(this.media >= 9.5){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }

    }
}
