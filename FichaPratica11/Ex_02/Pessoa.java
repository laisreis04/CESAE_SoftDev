package Ex_02;

public class Pessoa {

    private String nome;
    private int idade;
    private String telefone;
    private String email;



    public Pessoa(String nome, int idade, String telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
    }



    public String getNome() {
        return nome;
    }



    public static int getIdade() {
        return idade;
    }

    public void exibir_Dados(){

        System.out.println("Nome: " + nome + "| Idade: " + idade + "| Contato: " + telefone + "|" + "| Email: " + email);


    }



    public String getTelefone() {
        return telefone;
    }



    public String getEmail() {
        return email;
    }

    
    
    
}
