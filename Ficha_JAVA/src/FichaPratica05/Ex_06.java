package FichaPratica05;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        boolean crescente = true;


        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira os números(" + i + "): ");
            array[i] = input.nextInt();
        }

            //Condição dos numeros crescentes

        for (int i = 1;i < array.length; i++){
            if(array[i] <= array[i - 1]){
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
