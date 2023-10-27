package FichaPratica03;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, calc;

        System.out.println("Digite um número: ");
        num = input.nextInt();

        calc = 2;

        while(num > calc){
            System.out.println(calc);
            calc = calc + 2;
        }
    }
}
