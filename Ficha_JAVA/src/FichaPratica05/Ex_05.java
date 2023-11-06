package FichaPratica05;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int soma=0 ,media = 0;

        for(int i = 0; i<10;i++){
            System.out.print("Digite um número (" + i + "): ");
            array[i] = input.nextInt();
            soma = soma + array[i];
            media = i;
        }
        System.out.println("sua média é: " + soma/media);
    }
}
