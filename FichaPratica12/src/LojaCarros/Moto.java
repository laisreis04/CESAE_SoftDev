package LojaCarros;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Moto extends Veiculo{

    public Moto(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100Km) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, litros100Km);
    }

    /**
     * Método para imprimir o conteúdo do txt
     *
     * @throws FileNotFoundException
     */
    public static void impirmirFichiero(String caminho) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(caminho));


        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);
        }

        scanner.close();

    }





}