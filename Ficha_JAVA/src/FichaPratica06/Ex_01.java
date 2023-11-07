package FichaPratica06;

import java.util.Scanner;

public class Ex_01 {
    public static void fazerBraulho(String animal) {

        switch (animal){
            case "cao":
                System.out.println("Au, au, au");
                break;
            case "gato":
                System.out.println("Miau");
                break;
            case "peixe":
                System.out.println("Glub, glib");
                break;
            case "vaca":
                System.out.println("Muuuu");
                break;
            case "porco":
                System.out.println("Oinc, oinc");
                break;
            default:
                System.out.println("Barulho desconhecido");

        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String animalEscolhido;

        System.out.println("insira um animal: ");
        animalEscolhido = input.next();

        fazerBraulho(animalEscolhido);
    }
}

