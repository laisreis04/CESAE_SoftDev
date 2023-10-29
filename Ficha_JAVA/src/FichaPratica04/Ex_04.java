package FichaPratica04;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num;

        System.out.println("Digite um número: ");
        num = input.nextInt();
       
       while (num / 4 == 0) {
        System.out.println("Esse número é primo! Digite outro:  ");
        num = input.nextInt();
       }
       System.out.println("Esse numero não é primo!");
        

        

    }
    
}
