package FichaPratica03;

import java.util.Scanner;

public class Ex_13 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        int numEntradas,contador = 1, newNum = 0 , primeiroNum;

        System.out.println("Quantos números deseja insirir? :  ");
        numEntradas = input.nextInt();

        System.out.println("Digite um número:");
            primeiroNum = input.nextInt();

        while(contador < numEntradas){
            contador++;
            System.out.println("Digite um número:");
            newNum = input.nextInt();
            }
             if (newNum < primeiroNum) {
                System.out.println("Decrescente");
            }else{
                System.out.println("Crescente");
            }
            
            }
                

        }
    
    

