package FichaPratica03;

import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numUser, contador = 0, contador1 = 0, contador2 = 0, contador3 = 0 ;

        System.out.println("Digite um número: ");
        numUser = input.nextInt();

        while(numUser != - 1 && numUser <= 100){
            if (numUser >= 0 && numUser <= 25) {
            contador++;
            System.out.println("Insira número: ");
            numUser = input.nextInt();
            } 
                
            if (numUser >= 26 && numUser <= 50) {
                contador1++;
            System.out.println("Insira número: ");
            numUser = input.nextInt();
            }   
            if (numUser >= 51 && numUser <= 75) {
                contador2++;
            System.out.println("Insira número: ");
            numUser = input.nextInt();
            }
            if (numUser >= 76 && numUser <= 100) {
                contador3++;
            System.out.println("Insira número: ");
            numUser = input.nextInt();
            }   
            
        }

        System.out.println(" [0 , 25]: " + contador);
        System.out.println(" [26, 50]: " + contador1);
        System.out.println(" [51, 75]: " + contador2);
        System.out.println(" [76, 100]: " + contador3);


    }
    
}
