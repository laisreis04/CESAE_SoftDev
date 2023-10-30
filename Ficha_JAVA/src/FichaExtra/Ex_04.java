package FichaExtra;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int vogal;

        System.out.println("Digite a sua letra: ");
        
       String letra = input.next();

       switch (letra) {
        case "a":
            System.out.println("Vogal");
            break;
            case "e":
            System.out.println("Vogal");
            break;
            case "i":
            System.out.println("Vogal");
            break;
            case "o":
            System.out.println("Vogal");
            break;
            case "u":
            System.out.println("Vogal");
            break;
       
        default:
        System.out.println("Não é vogal");
            break;
       }

    }
    
}
