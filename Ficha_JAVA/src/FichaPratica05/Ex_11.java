package FichaPratica05;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int maiorNum, menorNum;

        for (int i = 0; i < matriz.length; i++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print("Digite um número: ");
                matriz[i][col] = input.nextInt();
            }
        }

        maiorNum = matriz[0][0];
        menorNum = matriz[0][0];


        for (int i = 0; i < matriz.length; i++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print(matriz[i][col] + " ");
                if (matriz[i][col] > maiorNum) {
                    maiorNum = matriz[i][col];
                } else if (matriz[i][col] < menorNum) {
                    menorNum = matriz[i][col];
                }

            }
            System.out.println();
        }

        System.out.println("Maior número: " + maiorNum);
        System.out.println("Menor número: " + menorNum);

    }
}
