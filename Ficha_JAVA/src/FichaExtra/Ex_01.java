package FichaExtra;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int idade;

        System.out.print("Sua idade: ");
        idade = input.nextInt();

        if(idade < 18){
            System.out.print("Sorry, mas você é menor de idade");
        }else{
            System.out.print("Maior de idade");
        }


    }
}
