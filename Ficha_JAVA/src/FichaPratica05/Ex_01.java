package FichaPratica05;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       int[] vetor = new int[10];
       int contador = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Inisra um número de (" + i + "): ");
            vetor[i] = input.nextInt();

        }


    }
}
