package Ex_03;

public class Funcionario extends Pessoa{

    private String funcao;

    public Funcionario(String nome, int anoNasc, String email, String telefone, String funcao) {
        super(nome, anoNasc, email, telefone);
        this.funcao = funcao;
    }

    @Override
    public void obetrFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }
}
