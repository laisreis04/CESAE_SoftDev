package FichaPratica05;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int arrayNext = 0;

        for(int i = 0; i < 10;i++){
            System.out.print("Insira os números(" + i + "): ");
            array[i] = input.nextInt();

            }


        arrayNext = array[0];


        for(int x = 0; x < 10; x++){
            System.out.println("O maior número é: " + arrayNext);
            }




        }
    }

