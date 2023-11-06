package FichaPratica05;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[12];
        int soma = 0;

        for(int i = 0; i < 12; i++){
            System.out.print("Insira seu salário do mês " + (i+1) + ":  ");
            vetor[i]= input.nextInt();
            soma = soma + vetor[i];
        }
        System.out.println("Soma do seu salário é: " + soma);
    }
}
