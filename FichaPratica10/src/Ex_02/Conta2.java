package Ex_02;

public class Conta2 {

    private String numConta;
    private double saldo;
    private String titular;
    private int anoAbertura = 2023;
    private double emprestimo;
    private double margemEmprestimo = 0.9;

    private double divida;

    public Conta2(String numConta, double saldo, String titular) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;

    }
    public void transferencia(Conta2 numDestinatario, double valor){

        if(this.saldo >= valor){
            System.out.println("Valor transferido" + valor);
            this.saldo -= valor;
            numDestinatario.saldo += valor;

        }else{
            System.out.println("Saldo indiponível");
        }

    }

    public  void aumentarSaldo (double valorDepositar) {

        //para atualizar o saldo uso a classe do saldo

        this.saldo += valorDepositar;
        System.out.println("Valor depositado: + " + valorDepositar + "\nSaldo total: " + this.saldo);
    }

    public void diminuirSaldo (double valorRetirar) {


        if (valorRetirar < this.saldo) {
            this.saldo -= valorRetirar;
            System.out.println("Valor retirado: - " + valorRetirar + "\nSaldo total: " + this.saldo);
        } else {
            System.out.println("Tá pobre amigo, não dá para retirar...");
        }
    }


    public boolean pedirEmprestimo(double valor) {

        System.out.println("A começar processo de emprestimo:");
        System.out.println("Divida: "+divida);
        System.out.println("Margem: "+saldo*margemEmprestimo);
        System.out.println("Saldo: "+saldo);

        //Como a pessoa abriu conta atualmente ela ainda não tem dividas. Só depois de adquirir emprestimo
        if (divida == 0){
            //Primeiro analisar a margem do emprestimo, para comparar depois como valor
            if(saldo*margemEmprestimo >= valor){
                saldo += valor;
                this.divida = valor;
                System.out.println("Parabéns você conseguiu o empréstimo\nSaldo atual:" + saldo + "\nDívida: " + divida);
                return true;
            }else {
                System.out.println("Saldo indiponivel");
                return false;
            }
        }else {
            System.out.println("Sua conta apresenta dividas");

        }
        return false;


    }
}
