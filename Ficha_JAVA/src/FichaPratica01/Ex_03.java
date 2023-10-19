package FichaPratica01;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//Para calcular a area e o perimetro, preciso saber a largura e a altura
        double larW, altH, area, per;

                //Ler largura
        System.out.print("Largura: ");
        larW= input.nextDouble();

        //Ler Altura
        System.out.print("Altura: ");
        altH= input.nextDouble();

        //Calcular Área
        area= larW * altH ;
        System.out.print("Sua área: " + area);

        per = 2*(larW) + 2*(altH);
        System.out.print("\nSeu perímetro: " + per);
    }
}
