package FichaPratica02;

import java.util.Scanner;

public class Ex_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3, menor, medio, maior;

        System.out.print("Número A: ");
        num1 = input.nextInt();

        System.out.print("Número B: ");
        num2 = input.nextInt();

        System.out.print("Número C: ");
        num3 = input.nextInt();

        if(num1 <= num2 && num1 <= num3) { // if(a < b < c)
            menor = num1;
            if (num2 <= num3) {  // a .. b ..c
                medio = num2;
                maior = num3;
            } else {            // a.... c ... b
                medio = num3;
                maior = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3){
                medio = num1;
                maior = num3;
            }else {
                medio = num3;
                maior = num1;
            }

        }else {
            menor = num3;
            if (num1 <= num2){
                medio = num1;
                maior = num2;
            }else{
                medio = num2;
                maior = num3;
            }
        }
        System.out.print("Ordem crescente é :" + menor +"," +  medio + "," + maior);
    }
}
