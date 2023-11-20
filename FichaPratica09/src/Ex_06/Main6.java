package Ex_06;

import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao;

        //Chamar a classe para o main

        Calculadora valores = new Calculadora();

        //para o utilizador inserir dados:
        do {

            double num1, num2;

            System.out.println("****Calculadora****\n Escolha uma opção");
            System.out.println("1. Somar");
            System.out.println("2. subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Sair");
            opcao = input.nextInt();

            System.out.print("Insira o primeiro numero: ");
            num1 = input.nextDouble();
            System.out.print("Insira o segundo numero: ");
            num2 = input.nextDouble();

            switch (opcao) {
                case 1:
                    valores.adicao(num1, num2);
                    System.out.println("Resultado = " + valores.adicao(num1,num2));
                    break;

                case 2:
                    System.out.println("Resultado = " + valores.subtracao(num1, num2));
                    break;

                case 3:
                    System.out.println("Resultado = " + valores.multiplicacao(num1, num2));

                    break;

                case 4:
                    System.out.println("Resultado = " + valores.divisao(num1, num2));
                    break;

                case 5:
                    System.out.println("Opção invalida");
                    break;

                case 0:
                    System.out.println("Bye");
                    break;

            }
        }while(opcao != 0);


    }
}



