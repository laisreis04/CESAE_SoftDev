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


    public static String[][]  lerFicheiroParaMatriz (String caminhoFicheiro) throws FileNotFoundException{

        File ficheiro11 = new File ("Ficha_JAVA/Ficheiros_07/exercicio_11.csv");
        Scanner scanner = new Scanner(ficheiro11);

        int numLinhas = (contarLinhasFicheiro(caminhoFicheiro)) - 1;

        //contar n de colunas

        int numColunas = contarColunas(caminhoFicheiro, ",");

        //declarar uma matriz com tamanho adequado 
        String [][] matrizTotal = new String[numLinhas][numColunas];

        String linhaAtual = scanner.nextLine();
        int linhaMatriz = 0;

        while(scanner.hasNextLine()){
            linhaAtual = scanner.nextLine();
            String[] itensLinha = linhaAtual.split(",");

            for(int i = 0;i< itensLinha.length; i++){
                matrizTotal[linhaMatriz][i] = itensLinha[i];
            }
            linhaMatriz++;
        }
        
        return matrizTotal;
    }

    /**
     * Método para imprimir a matriz na consola
     * @param matriz
     */

    public static void imprimirMatriz(String[][]matriz){

        for(int linha = 0;linha < matriz.length;linha++){
            for(int coluna = 0; coluna < matriz[0].length;coluna++){
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
        }
        System.out.println();
    }

    /**
     * Método para encontar no ficheiro o  genero escolhido pelo user
     * @param matrizTotal
     * @param genero
     */

    public static void procurarGenero(String[][]matrizTotal, String genero){

        for(int linha = 0; linha < matrizTotal.length;linha++){
            if(matrizTotal[linha][2].equals(genero)){
                System.out.println("Música: " + matrizTotal[linha][0]+ "\n" + "\tArtista: " + matrizTotal[linha][1]+ "\n\n");
            }
        }
    }

    /**
     * Método para procurar o ARTISTA escolhido
     * @param matrizTotal
     * @param artista
     */
    public static void procurarArtista(String [][]matrizTotal, String artista){

        for(int linha = 0; linha < matrizTotal.length;linha++){
            if(matrizTotal[linha][1].equals(artista)){
                System.out.println( "\tArtista: " + matrizTotal[linha][1]+ "\n" + "Música: " + matrizTotal[linha][0]+ "\n\n");
            }
        }
    }

    public static void musicaMaisLonga(String[][] matrizTotal, int segundos, int minutos){

        int duracaoMudada = (minutos*100) + segundos;

        int duracao;

        for(int linha = 0; linha < matrizTotal.length;linha++){
            String[][] duracaoString = matrizTotal[linha][3].split(":");
            duracao = Integer.parseInt(duracaoString[0]*100) + Integer.parseInt(duracaoString[1]);

            if(duracao <= duracaoMudada){
                for( int i = 0; i < matrizTotal;i++){
                    System.out.print(matrizTotal[linha][i]);
                }
                System.out.println();
            }

        }
    }



    /* Menu do Programa
     * Foi criada função para diminuir o tamanho do main
     */
    public static void main(String[] args) throws FileNotFoundException {
        
       Scanner input = new Scanner(System.in);

        
String [][] matrizTotal = lerFicheiroParaMatriz("Ficha_JAVA/Ficheiros_07/exercicio_11.csv");
      

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
                input.nextLine();
                String genero = input.next();

                procurarGenero(matrizTotal, genero);

                    
                    break;

                case 2:
                System.out.print("******ARTISTA SELECIONADO*******\n Digite o nome do artista: " + "\n");
                input.nextLine();
                String artista = input.next();

                procurarArtista(matrizTotal, artista);
                
                    break;

                case 3:
                System.out.print("******MÚSICA MAIS LONGA SELECIONADO*******\n Amusica mais longa é: " + "\n");
                input.nextLine();
                String musicaMais = input.next();

                musicaMaisLonga(matrizTotal);

                break;
        
                /* Opção Invalida */
                default:
                System.out.println(" Opção invalida!\n");
                    break;
            }

        }while(opcao != 9);

       
    }
    
}
