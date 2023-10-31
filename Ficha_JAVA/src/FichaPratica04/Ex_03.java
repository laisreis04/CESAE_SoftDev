package FichaPratica04;

import java.util.Scanner;

public class Ex_03 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int player1, player2;

        System.out.println("Player 1 digite um número de 0 a 100: ");   // Há alguma frma de deixar essa entrada oculta ? 
        player1 = input.nextInt();
        
        do{
            System.out.println("Player 2 sua vez! Descubra o número: ");
            player2 = input.nextInt();
            }
        }while (player2 != player1);
        
        System.out.println("Parabéns você acertou !!!");
    }
}
