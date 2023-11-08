package FichaPratica06;

import static FichaPratica06.Ex_05.*;

import java.util.Scanner;



public class Ex_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int[] array = new int[5];
        int opcao;

        for(int i= 0; i < array.length; i++){
            System.out.println("Escolha os números para a sua array: ");
            array[i] = input.nextInt();
        }


        do{
            System.out.println("8. Maior Elemento");
            System.out.println("9. Menor Elemento");

            System.out.println("Selecione a opção: ");
            opcao = input.nextInt();

            switch (opcao){
                case 7:
                    System.out.println("O maior valor é : " + maior(array));
                    break;
            }
        }while(opcao!= 1);

    }


}
