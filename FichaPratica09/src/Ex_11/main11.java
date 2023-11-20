package Ex_11;

public class main11 {

    public static void main(String[] args) {

        Conta conta1 = new Conta(456,452.80, "Pedro");
        Conta conta2 = new Conta(78, 500,"Nadia");


        conta1.transferencia(20,78);

        System.out.println();

        conta1.aumetarSaldo(500);

        conta1.dominuirSaldo(50);

    }



}
