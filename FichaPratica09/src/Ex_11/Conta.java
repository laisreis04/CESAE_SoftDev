package Ex_11;

public class Conta {

    private int numConta;
    private double saldo;
    private String titular;

    public Conta(int numConta, double saldo, String titular) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
    }

public double transferencia(double valor, int numContaTrans){

        numContaTrans = this.numConta;
        double saldoTotalDest = this.saldo - valor;

    System.out.println("Saldo total: " + saldoTotalDest + "\nValor transferido: " + valor);
        return saldoTotalDest;
    }

    public double aumetarSaldo (double valorMB){

        double saltoTotal = this.saldo + valorMB;

        System.out.println("Montante recebido: " + valorMB + "\nSaldo: " + saltoTotal);
        return this.saldo;
    }

    public double dominuirSaldo (double valorMB){
       double saldoTotal = this.saldo - valorMB;
        System.out.println("Levantou: " + valorMB +"\nSaldo Total: " + saldoTotal);
        return this.saldo;
    }

}
