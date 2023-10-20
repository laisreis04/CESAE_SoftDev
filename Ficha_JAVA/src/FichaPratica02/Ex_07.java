package FichaPratica02;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Escolha um numero: ");
        num = input.nextInt();

        if (num % 2 == 0){
            System.out.print("Seu número é par!");
        }else{
            System.out.print("Seu número é ímpar!");
        }
    }
}
