package Ex_05;

public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;

    }


    /**
     * Método para aumentar o sálario
     * @param a
     * @return
     */
    public void aumentarSalario(double a){



        this.salario = this.salario * (1+(a/100));
        System.out.println("Uau você recebeu um aumento, parabéns!\n"+ "\nValor total: " + this.salario);

    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    /**
     * Exibir Dados
     */

    public void exibirDados(){

        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
        System.out.println("Departamento: " + this.departamento);

    }
}
