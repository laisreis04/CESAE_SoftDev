package Ex_03;

import Ex_03.ENUM.Curso;

public class Aluno extends Pessoa{

    private Curso curso;

    private double mediaNotas;

    private String[][] pauta;

    public Aluno(String nome, int anoNasc, String email, String telefone, Curso curso, double mediaNotas, String[][] pauta) {
        super(nome, anoNasc, email, telefone);
        this.curso = curso;
        this.mediaNotas = mediaNotas;
        this.pauta = pauta;
    }


    @Override
    public void obetrFuncao() {
        
    }

    @Override
    public void imprimirHorario() {

    }
}
