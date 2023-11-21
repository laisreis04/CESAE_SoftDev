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

    public void exibirdados(){

        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Titular: " + this.titular);

    }


    public Conta transferencia(Conta numDestinatario, double valor){


             numDestinatario.saldo += valor;
             this.saldo -= valor;
             System.out.println("Valor recebido: +"+valor + "\nSaldo atual: " + numDestinatario.saldo);
            return this;
}

    public  void aumentarSaldo (double valorDepositar) {

        //para atualizar o saldo uso a classe do saldo

        this.saldo = this.saldo + valorDepositar;
        System.out.println("Valor depositado: +" + valorDepositar + "\nSaldo total: " + this.saldo);
    }

    public double diminuirSaldo (double valorRetirar){


        if(valorRetirar < this.saldo){
             this.saldo -= valorRetirar;
            System.out.println("Valor retirado: - " + valorRetirar + "\nSaldo total: " + this.saldo);
        }else {
            System.out.println("Tá pobre amigo, não dá para retirar...");
        }

        return this.saldo;

    }



}
