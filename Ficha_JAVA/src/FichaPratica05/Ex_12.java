package FichaPratica05;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array1 = new int[10];
        int[] array2 = new int[10];


        //ler array 1
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Insira os números: ");
            array1[i] = input.nextInt();
        }

        //Ler o array 2
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Insira os números: ");
            array2[i] = input.nextInt();
        }

        int[][] matriz = new int[array1.length][2];

        //CRIAR MATRIZ
        for (int j = 0; j < array1.length; j++) {
            matriz[j][0] = array1[j];
            matriz[j][1] = array2[j];

        }
        System.out.println();

//        //_______________________________________________
        for (int i = 0; i < matriz.length; i++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print(matriz[i][col] + " ");
            }
            System.out.println();
        }
    }
}
