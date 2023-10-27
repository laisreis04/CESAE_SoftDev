package FichaPratica03;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int limite,salto, contador=0;   // preciso de uma variavel para começar em 0 e somar mais pra frente

        System.out.println("Digite um número limite: ");
        limite = input.nextInt();

        System.out.println("Digite um número salto: ");
        salto = input.nextInt();

        while(limite >= contador){
            System.out.println(contador);
            contador = contador + salto;

        }
    }
}
