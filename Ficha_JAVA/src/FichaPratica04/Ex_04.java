package FichaPratica04;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num, div = 2;
        boolean primo = true;  //Inicia o valor como verdadeiro

        System.out.println("Digite um número: ");
        num = input.nextInt();

        while ( div < num){   //quando ele entra nessa condição o vaor é verdadeiro até verificar
            if (num % div == 0){   //aqui ele é verificado, e se o resto da divisão for = 0, quer dizer que ele tem mais um divisor, tornando a afirmação do boolean em falsa.
                primo = false;
            }
            div++;
        }
        if(primo){   // ele só entra aqui quando o boolean continua verdadeiro
            System.out.println("É primo");
        }else {
            System.out.println("Não é primo");
        }


    }
    
}
