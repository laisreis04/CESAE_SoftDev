package Ex_03;

import java.util.ArrayList;

public class Professor extends Pessoa{

    private ArrayList<Professor> areaFormacao;

    private int nivelAcademico;

    public Professor(String nome, int anoNasc, String email, String telefone, int nivelAcademico) {
        super(nome, anoNasc, email, telefone);
        this.areaFormacao = new ArrayList<>();
        this.nivelAcademico = nivelAcademico;
    }


    @Override
    public void obetrFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }
}
