package FichaPratica06;

import static FichaPratica06.Ex_05.*;

import java.sql.SQLOutput;
import java.util.Scanner;



public class Ex_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int[] array = new int[5];
        int opcao;


        for(int i= 0; i < array.length; i++){
            System.out.print("Número [" + i + "]: ");
            array[i] = input.nextInt();
        }


        do{
            System.out.println("7. Maior Elemento");
            System.out.println("8. Menor Elemento");
            System.out.println("9. Ordem crescente");

            System.out.println("1. Sair");

            System.out.println("Selecione a opção: ");
            opcao = input.nextInt();

            switch (opcao){
                case 7:
                    System.out.println("O maior valor é : " + maior(array));
                    break;

                case 8:
                    System.out.println("O seu menor elemento é: " + menor(array));
                    break;

                case 9:
                    if(crescente(array)){
                        System.out.println("É crescente");
                    }else {
                        System.out.println("Não é crescente!");
                    }
                    break;

                case 1:
                    System.out.println("Até a próxima! BYE");
                    break;


                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao!= 1);

    }


}
