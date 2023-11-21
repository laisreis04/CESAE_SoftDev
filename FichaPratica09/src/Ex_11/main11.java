package Ex_11;

public class main11 {

    public static void main(String[] args) {

        Conta conta1 = new Conta(456,452.80, "Pedro");
        Conta conta2 = new Conta(78, 500,"Nadia");
        Conta conta3 = new Conta(99,1200,"João");


        conta1.exibirdados();
        System.out.println();

        conta1.aumentarSaldo(1000);
        System.out.println();
        System.out.println();
        conta1.exibirdados();
        conta1.diminuirSaldo(120);
        System.out.println();


        conta3.exibirdados();
        conta2.exibirdados();
        conta2.transferencia(conta3, 450);
        System.out.println();
        conta3.exibirdados();
        conta2.exibirdados();
    }



}
