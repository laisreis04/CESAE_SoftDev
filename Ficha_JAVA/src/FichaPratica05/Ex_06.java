package FichaPratica05;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        boolean crescente = true;
        int menorElemento = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira os números(" + i + "): ");
            array[i] = input.nextInt();
        }

        menorElemento = array[0];

        for (int i = 0;i < 10; i++){
            if(array[i] < menorElemento){
                crescente = false;
            }

        }
        if(crescente){
            System.out.println("Sim, está em ordem crescente");
        }else {
            System.out.println("Sorry baby, mas não está em ordem cresecnte");
        }
    }
}
