package FichaPratica02;

import java.util.Scanner;

public class Ex_16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor, notas = 0;

        System.out.print("Insira o valor: ");
        valor = input.nextInt();

        if(valor % 5 == 0){
            notas = valor/200;
            System.out.print("Notas de 200: " + notas);
            valor = valor%200;

            notas = valor/100;
            System.out.print("\nNotas de 100: " + notas);
            valor = valor%100;

            notas = valor/50;
            System.out.print("\nNotas de 50: " + notas);
            valor = valor%50;

            notas = valor/20;
            System.out.print("\nNotas de 20: " + notas);
            valor = valor%20;

            notas = valor/10;
            System.out.print("\nNotas de 10: " + notas);
            valor = valor%10;

            notas = valor/5;
            System.out.print("\nNotas de 5: " + notas);


        }else {
            System.out.print("Não é multiplo de 5 !!!");
        }




    }
}
