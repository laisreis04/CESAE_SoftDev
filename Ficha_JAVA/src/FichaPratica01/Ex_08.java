package FichaPratica01;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int musicMin1, musicSec1, musicMin2, musicSec2, musicMin3, musicSec3, musicMin4, musicSec4, musicMin5, musicSec5, minToSec, hora, min, sec, totalSec;


        //É possivel ter apenas duas variaveis para os minutos e segundos, exemplo:
        //musica 1:
        // musicMin = input.nextInt();
        // musica 2:
        // musicMin = musciMin + input.nextInt();

        System.out.print("Minutos 1: ");
        musicMin1 = input.nextInt();

        System.out.print("Segundos 1: ");
        musicSec1 = input.nextInt();

        System.out.print("Minutos 2: ");
        musicMin2 = input.nextInt();

        System.out.print("Segundos 2: ");
        musicSec2 = input.nextInt();

        System.out.print("Minutos 3: ");
        musicMin3 = input.nextInt();

        System.out.print("Segundos 3: ");
        musicSec3 = input.nextInt();

        System.out.print("Minutos 4: ");
        musicMin4 = input.nextInt();

        System.out.print("Segundos 4: ");
        musicSec4 = input.nextInt();

        System.out.print("Minutos 5: ");
        musicMin5 = input.nextInt();

        System.out.print("Segundos 5: ");
        musicSec5 = input.nextInt();


        minToSec = (musicMin1 + musicMin2 + musicMin3 + musicMin4 + musicMin5) * 60;
        totalSec = minToSec + (musicSec1 + musicSec2 + musicSec3 + musicSec4 + musicSec5);

        //Usar o modulo "resto" do que sobra e atribuir ao novo valor do total

        hora = totalSec / 3600;
        totalSec = totalSec % 3600;
        min = totalSec / 60;
        totalSec = totalSec % 60;
        sec = totalSec;


        System.out.print("Total do Álbum: " + hora + "H" + min + "m" + sec + "s.");

    }
}
