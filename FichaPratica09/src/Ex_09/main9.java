package Ex_09;

public class main9 {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Tenis", 78.99);

        produto1.compra(5);
        produto1.venda(2);
        System.out.println();
        produto1.compra(10);
        produto1.venda(35);


    }
}
