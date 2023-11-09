package FichaPratica06;

import java.util.Scanner;

public class Ex_07 {

    public static void figura(String caracter, int linhas, int colunas) {

        // imprimir linhas preenchidas


        linhas = linhas - 2;


        //Primeira linha
        for (int i = 0; i < colunas; i++) {
            System.out.print(caracter);
        }
        System.out.println();

// linhas do meio
        for (int i = 0; i < linhas; i++) {
            System.out.print(caracter);
            for (int j = 0; j < colunas - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(caracter);
        }

        //Última linha
        for(int i = 0;i < colunas; i++){
            System.out.print(caracter);
        }
    }



    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String caracter;


        System.out.println("Escolha um caracter: ");
        caracter = input.next();

        System.out.println("Escolha a quantidade de linhas: ");
        int linhas = input.nextInt();

        System.out.println("Escolha a quantidade de colunas: ");
        int colunas = input.nextInt();

        figura(caracter, linhas, colunas);

    }


}


//        for (int s = 0; s < space; s++){
//        System.out.print(" ");