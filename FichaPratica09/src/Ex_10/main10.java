package Ex_10;

public class main10 {

    public static void main(String[] args) {

        Funcinario funcionario1 = new Funcinario("João", 1200, "Arbitragem");
        Funcinario funcionario2 = new Funcinario("Caboz", 300, "Arbitragem");
        Funcinario funcionario3 = new Funcinario("DjPerez", 300,"Som");


        funcionario1.exibirDados();
        funcionario1.aumentarSalario(10);
        System.out.println();


    }

}
