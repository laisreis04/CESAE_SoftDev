package FichaPratica03;

import java.util.Scanner;

public class Ex_14 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num, fatorial = 1, conta = 1;

        System.out.println("Seu número: ");
        num = input.nextInt();

        while (fatorial <= num ) {
        conta = conta * fatorial;
        fatorial++;
        }
        System.out.println("O fatorial do seu número é : " + conta);
    }
}
