package FichaPratica01;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double price1, price2, price3, total, desc;

        System.out.print("Preço 1: ");
        price1 = input.nextDouble();

        System.out.print("Preço 2: ");
        price2 = input.nextDouble();

        System.out.print("Preço 3: ");
        price3 = input.nextDouble();

        total = (price1 + price2 + price3) * 0.9;

        System.out.print("Preço com 10% de desconto: " + total + "€");
    }
}
