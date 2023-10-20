package FichaPratica01;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int val1, val2, swap;

        System.out.print("Valor 1: ");
        val1 = input.nextInt();
        System.out.print("Valor 2: ");
        val2 = input.nextInt();

        swap = val1;
        val1 = val2;
        val2 = swap;

        System.out.print("Swap Valor 1: " + val1 + "\nSwap Valor 2: " + swap);


        val1 = val1 + val2;
        val2 = val1 - val2;
        val1 = val1 - val2;


        System.out.print("\nNova troca valor 1: " + val1 + "\nNova troca valor 2: " + val2);



    }
}
