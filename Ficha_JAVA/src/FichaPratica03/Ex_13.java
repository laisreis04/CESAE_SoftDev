package FichaPratica03;

import java.util.Scanner;

public class Ex_13 {

    /**
     * @param args
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int numEntradas, contador = 1, newNum = 0, primeiroNum;
        boolean crescente = true;
        System.out.println("Quantos números deseja insirir? :  ");
        numEntradas = input.nextInt();

        System.out.println("Digite um número:");
        primeiroNum = input.nextInt();

        while (contador < numEntradas) {
            System.out.println("Digite um número:");
            newNum = input.nextInt();
            if(primeiroNum >= newNum){   //Criar um falso
                crescente = false;
            }
            primeiroNum = newNum;
            contador++;

        }
        if(crescente){   // especificar quando é verdadeiro
            System.out.println("Crescente");
        }else {
            System.out.println("Decrescente");
        }

    }
}

