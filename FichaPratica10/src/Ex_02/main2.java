package Ex_02;

public class main2 {

    public static void main(String[] args) {

        Conta2 con1 = new Conta2("45623", 5500.63, "Gabriel");
        Conta2 con2 = new Conta2("78956", 500, "Pedro");


        con2.pedirEmprestimo(2000);


    }
}
