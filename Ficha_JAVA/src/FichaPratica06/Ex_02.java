package FichaPratica06;

import java.util.Scanner;

public class Ex_02 {

    /**
     * Método que lê um inteiro positivo do utilizador.
     * @return Número inteiro positivo.
     */

    public static int lerInteiroPositivo(){

        Scanner input = new Scanner(System.in);
        int num;

        do{

            System.out.print("Insira um inteiro Positivo: ");
            num= input.nextInt();

        }while (num<0);

        return num;
    }

    public static void imprimirAsteristicos(int numeroAsteristicos) {

        for(int i = 0; i< numeroAsteristicos;i++){
            System.out.print("*");
        }


    }

    public static void main(String[] args) {


        imprimirAsteristicos(lerInteiroPositivo());
    }
}


