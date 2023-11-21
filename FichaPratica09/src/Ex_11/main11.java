package Ex_11;

public class main11 {

    public static void main(String[] args) {

        Conta conta1 = new Conta(456,452.80, "Pedro");
        Conta conta2 = new Conta(78, 500,"Nadia");
        Conta conta3 = new Conta(99,1200,"João");


        conta1.exibirdados();
        conta1.aumentarSaldo(100);
        System.out.println();
        conta1.exibirdados();

        conta3.exibirdados();

        conta3.transferencia(conta1,300);
        conta3.exibirdados();
        conta1.exibirdados();


    }



}
