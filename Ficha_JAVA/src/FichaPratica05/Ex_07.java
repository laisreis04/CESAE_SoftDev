package FichaPratica05;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int maiorValor = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número (" + i + "): ");
            array[i] = input.nextInt();
        }

        maiorValor = array[0];

        for (int i = 0; i < 10; i++) {
            if (array[i] > maiorValor) {
                maiorValor = array[i];
            }

        }
        if (maiorValor % 2 == 0) {
            System.out.println("O maior número par é: " + maiorValor);
        } else {
            System.out.println("BRUUHH, não tem número par aqui...Try again");
        }

    }

}
