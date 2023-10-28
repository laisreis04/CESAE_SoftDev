package FichaPratica03;

import java.util.Scanner;

public class Ex_12 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numStart, numEnd;

        System.out.println("Digite um número: ");
        numStart = input.nextInt();

        System.out.println("Digite um número: ");
        numEnd = input.nextInt();

        while(numStart <= numEnd){
            if (numStart % 5 == 0) {
                System.out.println("Saida: " + numStart);
            }
            numStart++;
        }

    }
    
}
