package FichaPratica06;

import java.util.Scanner;

public class Ex_08 {
    /**
     * Função para somar todos os elementos de uma matriz
     * @param matriz1 - Parametro usado para a 1ª matriz.
     * @param matriz2 - Parametro para a segunda matriz.
     */

   public static void somarMatriz (int [][] matriz1, int [][] matriz2){

    

    for (int linha = 0; linha < matriz1.length; linha++){
        for( int coluna = 0; coluna < matriz1[0].length; coluna++){
            System.out.print( matriz1[linha][coluna] + matriz2[linha][coluna] + "\t");
        }
    }
    System.out.println();


   }
   /**
    * Função para somar as matrizes 1 e 2 
    * @param matriz1 - Parametro para a matriz 1
    * @param matriz2 - Paramentro para a matriz
    * @return - Valor total da soma entra as duas matrizes 
    */

   public static int somatorioMatriz (int [][]matriz1, int [][]matriz2) {
    
    int somatorio = 0;

    for(int linha = 0; linha < matriz1.length; linha++){
        for (int coluna = 0; coluna < matriz1[0].length; coluna++){
            somatorio = somatorio + matriz1[linha][coluna] + matriz2[linha][coluna];
        }
    }
        return somatorio;
   }

   /**
    * Programa para somar duas matrizes
 * @param args
 */
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    int [][] matriz1 = new int[2][2];
    int [][] matriz2 = new int[2][2];
    somarMatriz(matriz1, matriz1);

// preencher a matriz 1

    for(int i = 0; i < matriz1.length;i++){
        for(int j = 0; j< matriz1[0].length;j++){
            System.out.print("*****MATRIZ 1 ******\n Valor para a posição [" + i + "]" + " [" + j + "] =");
            matriz1[i][j]=input.nextInt();
        }
        
    }
    

  //preencher a matriz 2  
 for(int i = 0; i < matriz2.length;i++){
        for(int j = 0; j< matriz2[0].length;j++){
            System.out.print("*****MATRIZ 2 ******\n Valor para a posição [" + i + "]" + " [" + j + "]=");
             matriz2[i][j]=input.nextInt();
        }
        
    }

    System.out.println("Soma dos elementos da matriz: ");
    somarMatriz(matriz1, matriz2);

    System.out.println();

    System.out.println("Somatório Matrizes = " + somatorioMatriz(matriz1, matriz2));
    
    
    
}
}

 