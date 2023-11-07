package FichaPratica05;

import java.util.Scanner;

public class Ex_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matriz[][] = new int[3][3];
        int soma = 0, valor = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Insira números: ");
                matriz[i][j] = input.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        for (int line = 0; line < matriz.length; line++) {
            for (int col = 0; col < matriz[0].length; col++) {
                if (line == col ) {
                    soma = soma + matriz[line][col];
                }
            }

        }
        System.out.println(" A soma é: " + soma);
    }
}
