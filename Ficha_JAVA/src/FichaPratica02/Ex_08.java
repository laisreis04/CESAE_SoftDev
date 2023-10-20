package FichaPratica02;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double grade1, grade2, grade3, media,  finalGrade;

        System.out.print("Nota 1: ");
        grade1 = input.nextDouble();

        System.out.print("Nota 2: ");
        grade2 = input.nextDouble();

        System.out.print("Nota 3: ");
        grade3 = input.nextDouble();

        media = (grade1*0.25 + grade2*0.35 + grade3*0.40) / (0.25 + 0.35 + 0.40);


    }
}
