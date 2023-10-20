package FichaPratica02;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int salario;

        System.out.print("Seu salário: ");
        salario = input.nextInt();

        if (salario <= 15000){
            System.out.print("Imposto a pagar: " + (salario*0.2));
        } else if (salario <= 20000) {
            System.out.print("Imposto a pagar: " + (salario*0.3));
        } else if (salario <= 25000) {
            System.out.print("Imposto a pagar: " + (salario*0.35));
        } else{
            System.out.print("Imposto a pagar: " +(salario*0.4));
        }
        System.out.print("\nA culpa não é nossa de você ter que pagar tanto imposto, reclama com o Governo!");
    }
}
