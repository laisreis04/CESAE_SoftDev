package FichaPratica02;

import java.util.Scanner;

public class Ex_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int hora, min, hora24;

        System.out.print("Hora: ");
        hora = input.nextInt();

        System.out.print("Minutos: ");
        min = input.nextInt();

        if(hora >= 12){
            hora24 = hora - 12;
            System.out.print("São " + hora24+ ":" + min + " PM" );
        }else {
            System.out.print("São " + hora+ ":" + min + " AM" );
        }

    }
}
