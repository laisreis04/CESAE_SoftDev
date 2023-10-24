package FichaPratica02;

import java.util.Scanner;

public class Ex_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int salarioM;

        System.out.print("Qual o seu salário médio: ");
        salarioM = input.nextInt();

        if(salarioM <= 2000){
            System.out.print("Pedimos desculpa, mas não vai rolar o crédito!");
        } else if (salarioM <= 4000) {
            System.out.print("Seu salário médio é: " + salarioM + "\nO valor do seu crédito é de :" + (salarioM*0.2));
        } else if (salarioM <= 6000) {
            System.out.print("Seu salário médio é: " + salarioM + "\nO valor do seu crédito é de :" + (salarioM*0.3));
        }else {
            System.out.print("Seu salário médio é: " + salarioM + "\nO valor do seu crédito é de :" + (salarioM*0.4));
        }

    }
}
