package FichaPratica04;

import java.util.Scanner;

public class Ex_01 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num1, num2, resultado = 0;
        String conti;


        do{
        System.out.println("Insira o primeiro número: ");
        num1 = input.nextInt();

        System.out.println("Insira um operador (+,-,*,/): ");
        String operador=input.next(); 

        System.out.println("Insira o segundo número: ");
        num2 = input.nextInt();
        
            switch (operador) {
            case "+":
                resultado= num1 + num2;
                System.out.println("Total: " + resultado);
                break;
            case "-":
                resultado= num1 - num2;
                System.out.println("Total: " + resultado);
                break;
            case "*":
                resultado= num1 * num2;
                System.out.println("Total: " + resultado);
                break;
            case "/":
                resultado= num1 / num2;
                System.out.println("Total: " + resultado);
                break;
        
            default: 
            System.out.println("Operador inválido!!!!");
                break;
            }
            do{
                System.out.println("Deseja continuar? (s/n): ");
            conti = input.next();
            }while( !conti.equals("s") && !conti.equals("n"));
            
        } while (conti.equals("s"));
        

         

    }
}
