package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_11 {

    /**
     * Método para contar Linhas do ficheiro
     * @param caminhoFicheiro
     * @return
     * @throws FileNotFoundException
     */
    public static int contarLinhasFicheiro (String caminhoFicheiro) throws FileNotFoundException{

        File ficheiro11 = new File ("Ficha_JAVA/Ficheiros_07/exercicio_11.csv");
        Scanner scanner = new Scanner(ficheiro11);

        int contagemLinha = 0;

        while(scanner.hasNextLine()){
            scanner.nextLine();
            contagemLinha++;
        }
        return contagemLinha;
    }
/**
 * Método para contar o total de colunas de uma linha do Ficheiro
 * @param args
 * @throws FileNotFoundException
 */
    public static int contarColunas(String caminhoFicheiro, String demilitador) throws FileNotFoundException{

        File ficheiro11 = new File ("Ficha_JAVA/Ficheiros_07/exercicio_11.csv");
        Scanner scanner = new Scanner(ficheiro11);

        int contarColunas = 0;

        String linha = scanner.nextLine();
        String [] itemLinhas = linha.split(demilitador);

        contarColunas = itemLinhas.length;

        return contarColunas;


    }


    public static String[][] = lerFicheiroParaMatriz (String caminhoFicheiro){

        File ficheiro11 = new File ("Ficha_JAVA/Ficheiros_07/exercicio_11.csv");
        Scanner scanner = new Scanner(ficheiro11);

        int numLinhas = (contarLinhasFicheiro(caminhoFicheiro)) - 1;


    }

    /* Menu do Programa
     * Foi criada função para diminuir o tamanho do main
     */
    public static void main(String[] args) throws FileNotFoundException {
        
       Scanner input = new Scanner(System.in);

        

      

        int opcao;
       

        do{

            System.out.println("***Programa para analisar música***\n");
            System.out.println("** Selecione uma Opção **\n");

            System.out.println("1. Pesquisar por género");
            System.out.println("2. Pesquisar por artista");
            System.out.println("3. Pesquisar por duração");
            System.out.println("4. Pesquisar por músicas longas");
            System.out.println("5. Pesquisar por número de músicas no ficheiro\n");
            System.out.println("9. Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                System.out.print("******GÉNERO SELECIONADO*******\n Digite o género: " + "\n");
                    String genero = input.next();

                    
                    break;

                case 2:
                
                    break;

                case 3:
        
                /* Opção Invalida */
                default:
                System.out.println(" Opção invalida!\n");
                    break;
            }

        }while(opcao != 9);

        scanner.close();
        
        input.close();
    }
    
}
