package Ex_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculator calculadora = new Calculator();

        int num1, num2;
        String operacao;

        System.out.print("Inisira numero inteiro: ");
        num1=input.nextInt();

        System.out.print("Insira um operador (+,-,/,*): ");
        operacao=input.next();

        System.out.print("Insira um numero inteiro:");
        num2 = input.nextInt();

        switch (operacao){
            case "+":
                calculadora.add(num1,num1);
                break;
            case "-":
                calculadora.subtract(num1,num2);
                break;
            case "/":
                calculadora.divide(num1,num2);
                break;
            case "*":
                calculadora.multiply(num1,num2);
                break;


        }
    }
}