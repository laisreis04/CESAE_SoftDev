package FichaExtraCiclos;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int numUser, contador = 0;

        System.out.println("Insira um número (de 1 a 10)");
        numUser = input.nextInt();

        System.out.println("Tabuada do " + numUser + ":");

        while(contador <= 10){
            System.out.println(numUser + " x " +  contador + " = " + (numUser*contador));
            contador++;
        }
        ;
    }
}
