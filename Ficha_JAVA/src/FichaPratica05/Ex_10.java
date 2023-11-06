package FichaPratica05;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[3][5];
        int numIgual = 0,contador = 0 ;

        for(int i = 0;i < 3;i++){
            for (int col = 0;col < 5;col++){
                System.out.print("Digite um numero: ");
                matriz[i][col] = input.nextInt();
            }
        }
        numIgual = matriz[0][0];

        for (int i = 0; i < 3; i++){
            for (int col = 0;col < 5;col++){
                System.out.print(matriz[i][col] + " ");

                }
            if (numIgual == matriz[i][col]){
                System.out.println("Seu numero repete na linha: " + i + " e na coluna: " + col);
            }else{
                System.out.println("Seu numero não repete! ");
                System.out.println();
            }
        }
    }
}
