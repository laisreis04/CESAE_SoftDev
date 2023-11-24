package Ex_03;

import Ex_02.Pessoa;

public class main3 {
    public static void main(String[] args) {

        Peixe robalo = new Peixe("nadadora",1,14.50);
        Peixe bacalhau = new Peixe("noruega", 20, 50.99);
        Peixe tubarao = new Peixe("discovery", 300,80.70);
        Peixe atum = new Peixe("atum", 45, 50.20);

        Marisco siri = new Marisco("Molusco", 78, 100.50);
        Marisco lagosta = new Marisco("Lafosta", 50, 90.99);
        Marisco sapateira = new Marisco("sapateira", 50, 41.23);


        Barco_De_Pesca perola = new Barco_De_Pesca("Perola Negra", "azul", "1988", 12, 100, Marca.BENTZ);


        perola.pescarPeixe(robalo);
        perola.pescarMarisco(siri);

        System.out.println("Salario da tripulação " + perola.salarioTripulaao());






    }
}
