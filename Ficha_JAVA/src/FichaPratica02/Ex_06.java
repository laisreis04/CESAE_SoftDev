package FichaPratica02;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int value1, value2;

        System.out.print("Introduza um valor 1: ");
        value1 = input.nextInt();

        System.out.print("Introduza um valor 2: ");
        value2 = input.nextInt();

        if (value1 > value2){
            System.out.print("Maior valor: " + value1 + "\nMenor: valor: " + value2);
        }else {
            System.out.print("Maior valor: " + value2 + "\nMenor valor: " + value1);
        }
    }
}
