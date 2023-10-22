package FichaPratica02;

import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Insira o número 1: ");
        num1 = input.nextInt();

        System.out.print("Insira o número 1: ");
        num2 = input.nextInt();

        System.out.print("Insira o número 1: ");
        num3 = input.nextInt();

        if(num1 < num2 && num1 < num3){
            System.out.print("O menor número é : " + num1);
        }else if (num2 < num1 && num2 < num3) {
            System.out.print("O menor número é : " + num2);
        }else {
            System.out.print("O menor númeor é o: " + num3);
        }
    }
}
