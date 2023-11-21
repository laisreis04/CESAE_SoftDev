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


    public void transferencia(Conta numDestinatario, double valor){

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

    public void diminuirSaldo (double valorRetirar){


        if(valorRetirar < this.saldo){
             this.saldo -= valorRetirar;
            System.out.println("Valor retirado: - " + valorRetirar + "\nSaldo total: " + this.saldo);
        }else {
            System.out.println("Tá pobre amigo, não dá para retirar...");
        }



    }



}
