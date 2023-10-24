package FichaPratica02;

import java.util.Scanner;

public class Ex_18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int  dias, pagar = 0;

        System.out.print("Insira os dias que trabalhou esse mês: ");
        dias = input.nextInt();

        System.out.print("Deve ultizar \n'E' para empregado \n 'C' para Chefe \n 'A' para administradores \n Insira a letra correspondente ao seu cargo: ");
        String cargo = input.next();

        //valor iliquido a receber

        switch (pagar){
            case 'E':
                System.out.print("Valor iliquido a receber é: " + dias*40*5 ); //A
                System.out.print("\nTotal do subsídio de alimentação: " + dias*5 ); //B
                if (dias*40*5 < 1000){  //C
                    System.out.print("\nRetenção de IRS: " + dias*40*5*0.1 );
                }
                System.out.print("\nSegurança Social: " + dias*40*5*0.3475 ); //D
                System.out.print("\nValor líquido: " + dias*40*5*0.3475*0.1 ); //D
        }

    }
}
