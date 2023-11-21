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
    public void aumentarSalario(double a){



        this.salario = this.salario * (1+(a/100));
        System.out.println("Uau você recebeu um aumento, parabéns!\n"+ "\nValor total: " + this.salario);

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
