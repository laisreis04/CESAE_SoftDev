package FichaPratica03;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 0, numUser, numLess5, numPlus5;

        System.out.println("Digite um número: ");
        numUser = input.nextInt();

        numLess5 = numUser - 5;
        numPlus5 = numUser + 5;

        while(numUser > numLess5){
            System.out.println(numLess5);
            numLess5++;
        }

        numUser++;

        while(numUser <= numPlus5){
            System.out.println(numUser);
            numUser++;
        }
    }
}
