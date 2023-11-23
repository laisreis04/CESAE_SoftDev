package Ex_03;

import Ex_02.Pessoa;

public class main3 {
    public static void main(String[] args) {

        Peixe robalo = new Peixe("nadadora",1,14);
        Peixe bacalhau = new Peixe("noruega", 20, 50);
        Peixe tubarao = new Peixe("discovery", 300,700);

        Barco_De_Pesca navegante = new Barco_De_Pesca("capitao", "azul", "1888",5,1000);

       Barco_De_Pesca navio = new Barco_De_Pesca("perola", "preto","1500", 8,10000);


       navio.exibirDados_Barco();
        System.out.println("Adicinou: " + robalo.getPeso()+"kg de peixe");
       navio.addPescarPeixe(robalo);
       navio.removeLargarPeixe(robalo);

        System.out.println();
        System.out.println();
        navio.exibirDados_Barco();
        System.out.println();

        navio.totalPescado();

    }
}
