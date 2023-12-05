package Ex_03;

public abstract class Pessoa {

    private String nome;
    private int anoNasc;
    private String email;

    private String telefone;

    public Pessoa(String nome, int anoNasc, String email, String telefone) {
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.email = email;
        this.telefone = telefone;
    }

    public abstract void obetrFuncao();

    public void exibirDetalhes(){

        System.out.println("Nome: " + nome+ "\nAno de Nascimento: " + anoNasc + "\nEmail: " + email + "\nTelefone: " + telefone  );

    }

    public abstract void imprimirHorario();
}
