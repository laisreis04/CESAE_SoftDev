package FichaExtra;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor;

        System.out.print("Valor da compra: ");
        valor = input.nextInt();

        if(valor >= 100){
            System.out.print("Sua compra tem 10% de desconto. Total " + valor*0.9 + " Euros");
        }else{
            System.out.print("Total da sua compra " + valor + " Euros");
        }
    }
}
