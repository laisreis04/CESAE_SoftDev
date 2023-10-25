package FichaPratica02;

import java.util.Scanner;

public class Ex_18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int  dias;

        System.out.print("Insira os dias que trabalhou esse mês: ");
        dias = input.nextInt();

        System.out.print("Deve ultizar \n'E' para empregado \n 'C' para Chefe \n 'A' para administradores \n Insira a letra correspondente ao seu cargo: ");
        String cargo = input.next();

        //valor iliquido a receber

        switch (cargo){
            case "E":
                System.out.print("Valor iliquido a receber é: " + dias*40*5 + "€"); //A
                System.out.print("\nTotal do subsídio de alimentação: " + dias*5 + "€"); //B
                if (dias*40*5 < 1000){  //C
                    System.out.print("\nRetenção de IRS: " + dias*40*5*0.1 + "€");
                }else {
                    System.out.print("\nRetenção de IRS: " + dias*40*5*0.2 + "€");
                }
                System.out.print("\nSegurança Social: " + dias*40*5*0.3475 + "€"); //D
                System.out.print("\nValor líquido: " + (dias*40*5 - dias*40*5*0.3475*0.1) + "€"); //E
                break;

            case "C":
                System.out.print("Valor iliquido a receber é: " + dias*60*7.5 + "€"); //A
                System.out.print("\nTotal do subsídio de alimentação: " + dias*7.5 + "€"); //B
                if (dias*60*7.5 < 1000){  //C
                    System.out.print("\nRetenção de IRS: " + dias*60*7.5*0.1 + "€");
                }else {
                    System.out.print("\nRetenção de IRS: " + dias*60*7.5*0.2 + "€");
                }
                System.out.print("\nSegurança Social: " + dias*60*7.5*0.3475 + "€" ); //D
                System.out.print("\nValor líquido: " + (dias*60*7.5 - dias*60*7.5*0.3475*0.2) + "€"); //E
                break;

            case "A":
                System.out.print("Valor iliquido a receber é: " + dias*80*7.5 + "€"); //A
                System.out.print("\nTotal do subsídio de alimentação: " + dias*7.5 + "€" ); //B
                if (dias*80*7.5 < 1000){  //C
                    System.out.print("\nRetenção de IRS: " + dias*80*7.5*0.1+ "€" );
                }else {
                    System.out.print("\nRetenção de IRS: " + dias*80*7.5*0.1 + "€");
                }
                System.out.print("\nSegurança Social: " + dias*80*5*0.30 + "€"); //D
                System.out.print("\nValor líquido: " + (dias*80*7.5 - dias*80*7.5*0.30*0.2) + "€"); //E
                break;

        }

    }
}
