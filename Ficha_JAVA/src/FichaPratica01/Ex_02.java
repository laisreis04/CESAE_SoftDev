package FichaPratica01;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, soma, sub, mult, div;
        System.out.print("Insira um numéro: ");
        num1 = input.nextInt();
        System.out.print("Insira um numéro: ");
        num2 = input.nextInt();

        soma = num1 + num2;
        sub = num1 - num2;
        div = num1 / num2;
        mult = num1 * num2;

        System.out.print("Soma: " + soma + "\nSubtração: " + sub + "\nMultiplição: " + mult + "\nDivisão: " + div);



    }
}
