package FichaExtra;

import java.util.Scanner;

public class Ex_05 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Adivinhe o número de 1 a 100. \nDigite aqui: ");
        num = input.nextInt();

        if(num <= 34){
            System.out.println("Muito baixo! tente novamente; ");
        }else
        System.out.println("Muito alto");
        System.out.println("Digite: ");
        num = input.nextInt();
        if(num == 35){
            System.out.println("Acertou !!!!");
        }
    }
}