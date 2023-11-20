package Ex_08;

public class main8 {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Douglas", 24,"Enfermagem", 8.5);
        Aluno aluno2= new Aluno("Margarida", 25, "Enfermagem", 17);

        aluno1.exbirDetalhesAluno();
        aluno1.situacao();
        System.out.println();
        aluno2.exbirDetalhesAluno();
        aluno2.situacao();

    }
}
