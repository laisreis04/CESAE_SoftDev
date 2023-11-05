package FichaPratica05;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[13];
        int soma = 0;

        for(int i = 1; i < 13; i++){
            System.out.print("Insira seu salário do mês " + i + ":  ");
            vetor[i]= input.nextInt();
            soma = soma + vetor[i];
        }
        System.out.println("Soma do seu salário é: " + soma);
    }
}
