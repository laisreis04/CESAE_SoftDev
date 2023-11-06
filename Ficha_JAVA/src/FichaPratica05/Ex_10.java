package FichaPratica05;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[3][5];
        int numIgual, contador = 0 ;

         // Preencher matriz
        for(int i = 0;i < 3;i++){
            for (int col = 0;col < 5;col++){
                System.out.print("Digite um numero: ");
                matriz[i][col] = input.nextInt();
            }
        }

        // Ler pesquisa
        numIgual = input.nextInt();

        for (int i = 0; i < 3; i++){
            for (int col = 0;col < 5;col++){
                if (numIgual == matriz[i][col]){
//                    System.out.println("Encontrei um "+numIgual);
                    contador++;
                }
            }
        }


        System.out.println("O número "+numIgual+" aparece "+contador+" vezes");

    }
}
