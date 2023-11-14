package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) throws FileNotFoundException {

        File ficheiro10 = new File("Ficha_JAVA/Ficheiros_07/exercicio_10.csv");

        Scanner scanner = new Scanner(ficheiro10);

        double total = 0, quantidadeVendida, precoUnitario;

        String linha = scanner.nextLine();;

        while(scanner.hasNextLine()){
            linha = scanner.nextLine();
            String[] itensLinha = linha.split(",");

            quantidadeVendida= Double.parseDouble(itensLinha[2]);
            precoUnitario = Double.parseDouble(itensLinha[3]);


            //Para somar os valores de todas as linhas (total = total + total .......)
            total += (quantidadeVendida*precoUnitario);

        }
        System.out.println(total + "€");
    }
}
