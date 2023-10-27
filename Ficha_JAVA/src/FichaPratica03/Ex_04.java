package FichaPratica03;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 0, numUser;

        System.out.println("Insira um número: ");
        numUser = input.nextInt();


        while(num <= numUser){
            System.out.println(num);
            num++;
        }
    }
}
