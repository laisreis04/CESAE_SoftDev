package FichaPratica02;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario;

        System.out.print("Salário: ");
        salario = input.nextDouble();

        if(salario<= 15000){
            System.out.print("Taxa de 20%: " + (salario*0.2));
        }else {
            System.out.print("Taxa 30%: "+ (salario*0.3));
        }
    }
}
