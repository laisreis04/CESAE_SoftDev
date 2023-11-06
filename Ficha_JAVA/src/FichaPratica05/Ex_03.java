package FichaPratica05;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int maiorElemento = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira os números(" + i + "): ");
            array[i] = input.nextInt();

        }


        maiorElemento = array[0];


        for (int i = 0; i <10; i++) {
            if(array[i]>maiorElemento){
                System.out.println("Maior foi substituido por: "+array[i]);
                maiorElemento=array[i];
            }
        }

        System.out.println("O maior número: " + maiorElemento);
    }
}

