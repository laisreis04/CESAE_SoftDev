package FichaPratica02;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        double num1, num2, resultado = 0;


        System.out.print("Bora calcular, essa é uma calculadora simples :)");

        System.out.print("\nInsira um número: ");
        num1 = input.nextDouble();

        System.out.print("Insira o operador (+, -,/, *): ");
        String operador = input.next();

        System.out.print("Insira um número: ");
        num2 = input.nextDouble();

        switch (operador){
            case "+":
                resultado = num1 + num2;
                System.out.print("Resultado = " + resultado);
                break;

            case "-":
                resultado = num1 - num2;
                System.out.print("Resultado = " + resultado);
                break;

            case "/":
                resultado = num1 / num2;
                System.out.print("Resultado = " + resultado);
                break;

            case "*":
                resultado = num1 * num2;
                System.out.print("Resultado = " + resultado);
                break;

            default:
                System.out.print("Operador inválido!");
                break;
        }

    }

}
