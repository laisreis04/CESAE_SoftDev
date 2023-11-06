package FichaPratica05;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for(int i= 0; i < 3;i++){
            for (int col = 0; col < 3; col++){
                System.out.print("Digite um número (" + i + "): ");
                matriz[i][col]= input.nextInt();
            }

        }
        for(int i = 0; i < 3;i++){
            for (int col = 0;col < 3;col++){
                System.out.print(matriz[i][col]+ " ");
            }
            System.out.println();
        }

    }
}
