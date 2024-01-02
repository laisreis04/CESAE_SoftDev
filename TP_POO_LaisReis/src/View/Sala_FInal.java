package View;

import Domain.Jogo;
import Tools.TXTReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Sala_FInal {

    public static void salaFinal() throws IOException, InterruptedException {

        TXTReader.imprimirFicheiro("src/Files/Finale");
        Scanner input = new Scanner(System.in);
        int opcao;

do {
    System.out.println("Selecione a seguinte opção:" );

    System.out.println("1. Começar novamente");
    System.out.println("2. Sair");


    opcao = input.nextInt();

    switch (opcao){
        case 1:
            Jogo jogoInicio = new Jogo();
            jogoInicio.criarPersonagem();
            break;
        case 2:
            break;
        default:
            System.out.println("Opção Inválida");

    }

}while (opcao != 2);


    }

}
