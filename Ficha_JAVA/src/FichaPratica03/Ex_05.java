package FichaPratica03;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int  numStart, numEnd;      // ele vai incrementar nele mesmo (numStart)

        System.out.println("Digite um número para começar: ");
        numStart = input.nextInt();

        System.out.println("Digite um número para parar: ");
        numEnd = input.nextInt();

        while(numStart <= numEnd){
            System.out.println(numStart);
            numStart++;
        }

    }
}
