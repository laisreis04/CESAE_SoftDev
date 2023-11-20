package Ex_10;

public class Funcinario {

    private String nome;
    private double salario;
    private String departamento;

    public Funcinario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }


    /**
     * Método para aumentar o sálario
     * @param a
     * @return
     */
    public double aumentarSalario(double a){

        double totalAumento;
        double percentagemAumento;

        percentagemAumento = this.salario * (a/100);
        totalAumento = this.salario + percentagemAumento;
        System.out.println("Uau você recebeu um aumento, parabéns!\nValor do aumento: " + percentagemAumento + "\nValor total: " + totalAumento);
    return this.salario;
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
