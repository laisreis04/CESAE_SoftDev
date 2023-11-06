package FichaPratica05;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int soma = 0;

        for(int i = 0;i < 5; i++){
            for( int col = 0; col < 5;col++){
                System.out.print("Digite um número: " );
                matriz[i][col] = input.nextInt();
            }
        }
        for(int i = 0; i < 5;i++){
            for(int col = 0;col < 5;col++){
                System.out.print(matriz[i][col] + " ");
                soma= soma + matriz[i][col];
            }
            System.out.println();
        }
        System.out.println("A soma é = " + soma);
    }
}
