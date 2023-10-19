package FichaPratica01;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Valores das variaves
        double area, raio, pi = 3.1415;

        //Ler variavel
        System.out.print("Indique o valor: ");
        raio = input.nextDouble();

        // Calcular
        area = pi * (raio*raio);

        //Apresentar Resultado (imprimir)
        System.out.print("Área: " + area);
    }

}
