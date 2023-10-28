package FichaPratica03;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numUser, sum = 0, enter = 0;

        System.out.println("Digite um número: ");   //Tenho que iniciar com uma valor que o user vai colocar
        numUser = input.nextInt();

        while(numUser != -1){
            enter++;
            sum = sum + numUser;
            System.out.println("Digite um número: ");
            numUser = input.nextInt();



            System.out.println("numUser: "+numUser);
            System.out.println("Sum: "+sum+"\n");
            }
        System.out.println("Média: " + sum / enter);
        }
    }

