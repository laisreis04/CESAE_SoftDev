package FichaPratica01;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double value1, value2, value3, per20, per30, per50, media;

        System.out.print("Indique seu valor 1: ");
        value1 = input.nextDouble();

        System.out.print("Indique seu valor 2: ");
        value2 = input.nextDouble();

        System.out.print("Indique seu valor 3: ");
        value3 = input.nextDouble();

        per20 = 0.20;
        per30 = 0.30;
        per50 = 0.50;

        media = (value1 * per20 + value2 + per30 + value3 * per50) / (per20 + per30 + per50);

        System.out.print("Sua media: " + media);
    }
}
