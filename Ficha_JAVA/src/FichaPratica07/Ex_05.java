package FichaPratica07;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Ex_05 {

    public static void main(String[] args) throws FileNotFoundException{

        File ficheiroNumeros = new File("Ficha_JAVA/Ficheiros_07/exercicio_05_31.txt");
        File ficheiroNumeros2 = new File("Ficha_JAVA/Ficheiros_07/exercicio_05_1999.txt");

        
        Scanner numerosInteiros = new Scanner(ficheiroNumeros);
        Scanner numerosInteiros2 = new Scanner(ficheiroNumeros2);

        int numero, total = 0, numero2, total2 = 0 ;

        while (numerosInteiros.hasNextInt()) {
            numero = numerosInteiros.nextInt();
            total += numero;
        }

        while(numerosInteiros2.hasNextInt()){
            numero2= numerosInteiros2.nextInt();
            total2 += numero2;
        }

        System.out.println("Total primeiro arquivo: " + total);
        System.out.println("Total segundo arquivo: " + total2);

        numerosInteiros.close();
        numerosInteiros2.close();
    }
    
}
