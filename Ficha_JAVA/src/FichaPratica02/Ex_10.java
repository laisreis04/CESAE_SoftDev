package FichaPratica02;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        double num1, num2, resultado, operador;


        System.out.print("Bora calcular, essa é uma calculadora simples :)");

        System.out.print("\nInsira um número: ");
        num1 = input.nextDouble();

        System.out.print("\nInsira o operador (+, -,/, *): ");
        String operador = input.next();

        System.out.print("\nInsira um número: ");
        num2 = input.nextDouble();

        switch (operador){
            case "+":
                resultado = num1 + num2;
                break;

            case "-":
                resultado = num1 - num2;
                break;

            case "/":
                resultado = num1 / num2;
                break;

            case "*":
                resultado = num1 * num2;
                break;

            default:
                System.out.print("Operador inválido!");
        }
        System.out.print("Resultado = " + resultado);
    }

}
