package FichaPratica05;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] array = new int[10];
        int menorElemento = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Digite um número (" + i + " ): ");
            array[i]= input.nextInt();
        }
        menorElemento = array[0];

        for (int x = 0; x < 10; x++){
            if (array[x] < menorElemento){
                menorElemento = array[x];
            }

        }
        System.out.println("Menor númeor é: " + menorElemento);
    }
}
