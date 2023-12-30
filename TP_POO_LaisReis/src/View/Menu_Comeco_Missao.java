package View;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu_Comeco_Missao {


    public void primeiraMissao()throws FileNotFoundException{

        Scanner input = new Scanner(System.in);

        int opcao;

        System.out.println("Você pode escolher entra dois caminhos:\n");
        System.out.println("1. Encontro com os Juízes:\n" +
                "\n" +
                "Neste caminho, nossa heroína enfrenta os Juízes, figuras poderosas e implacáveis. " +
                "Ela usará suas habilidades e astúcia para desafiar a autoridade opressora e libertar as bruxas aprisionadas. Cada desafio vencido fortalecerá sua determinação, " +
                "mas também aumentará a intensidade da perseguição contra ela.");
        System.out.println("2. Encontro amoroso com o Cavaleiro:\n" +
                "\n" +
                "Nesta opção, nossa heroína se envolve romanticamente com um Cavaleiro, uma aliança perigosa e proibida. " +
                "O romance traz prazer, mas também implica riscos. A jornada amorosa afetará a missão principal, adicionando uma camada de complexidade emocional. " +
                "No entanto, cada passo desse relacionamento desviará a atenção da missão, diminuindo a eficácia da luta contra os opressores.");

        opcao = input.nextInt();


        switch (opcao){

            case 1:

        }

    }

}
