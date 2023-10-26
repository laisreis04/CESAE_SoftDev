package FichaExtra;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int peso;

        System.out.print("Insira seu peso: ");
        peso = input.nextInt();

        if(peso >= 0){
            System.out.print("Seu peso lunar é: " + peso*0.16 + " Kilos");
        }else{
            System.out.print("Seu peso é tão pouquinho que você nem exite na lua! ");
        }
    }
    
}
