package FichaPratica02;

import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double saldo, montante, saldoFinal;

        System.out.print("Insira seu saldo:  ");
        saldo = input.nextDouble();

        System.out.print("Montante a ser retirado/acrescido: ");
        montante= input.nextDouble();

        saldoFinal = saldo + montante;

        if(montante >=0){
            System.out.print("\nSeu saldo atual é de: " + saldoFinal);
        }else  {
            System.out.print("Operação Inválida: " + saldo + "€\n");
        }




    }
}
