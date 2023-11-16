package LaisReis;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class TrabalhoPratico {


    /**
     * Método para CONTAR LINHAS no Ficheiro
     * @param caminhoFicheiroGS
     * @return
     * @throws FileNotFoundException
     */
    public static int contarLinhas (String caminhoFicheiroGS) throws FileNotFoundException{


        //Ficheiro da Game Start, o ficheiro ficou gravado fora do src, junto com a lista de exercicios, em sua respctiva pasta.
        File ficheiroGS = new File ("Ficha_JAVA/Ficheiros_07/GameStart_V2.csv");

        Scanner scanner = new Scanner (ficheiroGS);

        int contadorLinhas = 0;

        //A primeira linha não conta, assim é colocado o scanner.nextLine() para "saltar" a primeira linha.

        while(scanner.hasNextLine()){
            scanner.nextLine();
            contadorLinhas++;
        }

        //retornar para ser chamada depois

        return contadorLinhas;

    }

    /**
     * Método para medir o tamanho de uma linha, dividir e CONTAR COLUNA.
     * @param caminhoFicheiroGS
     * @return
     * @throws FileNotFoundException
     */
    public static int contarColunas (String caminhoFicheiroGS) throws FileNotFoundException{

        File ficheiroGS = new File ("Ficha_JAVA/Ficheiros_07/GameStart_V2.csv");

        Scanner scanner = new Scanner (ficheiroGS);

        int contadorColunas = 0;


        //Separar a linha em colunas usando o split.
        String linha = scanner.nextLine();
        String[] itensLinha = linha.split(";");

        //Atribuir as coluna para uma variavel, assim posso medir o seu tamanho.

        contadorColunas = itensLinha.length;

        //Retornar para ser chamada depois

        return contadorColunas;

    }

    /**
     * Método para "gravar" o ficheiro numa Matriz
     * @param caminhoFicheiroGS
     * @return
     * @throws FileNotFoundException
     */
    public static String[][] fichieroParaMatriz (String caminhoFicheiroGS) throws FileNotFoundException{

        File ficheiroGS = new File ("Ficha_JAVA/Ficheiros_07/GameStart_V2.csv");

        Scanner scanner = new Scanner (ficheiroGS);


        //Atribuir o valor do numLinhas já com a função feita. E "Tirar uma linha, pois essa é apenas os títulos das colunas
        int numLinhas = (contarLinhas(caminhoFicheiroGS)) -1;

        //Atribuir um valor para as colunas (usando a função)
        int numColunas = (contarColunas(caminhoFicheiroGS));

        //Atribuir uma Matriz para o ficheiro
        String[][] matrizGS = new String[numLinhas][numColunas];


        //Gravar o ficheiro na matriz ! Boraaa


        //Para passar para a próxima linha
        String linhaAtual = scanner.nextLine();

        //Forma "controlar" as linhas
        int linhaMatriz = 0;

        //Loop para passar o scanner pelo ficheiro e ir gravando seus intens numa Matriz

        while(scanner.hasNextLine()) {
            linhaAtual = scanner.nextLine();
            String[] itensLinha = linhaAtual.split(";");


            //loop para atribuir colunas as linhas

            for (int coluna = 0; coluna < itensLinha.length; coluna++) {
                matrizGS[linhaMatriz][coluna] = itensLinha[coluna];

            }
            linhaMatriz++;
        }

        return matrizGS;
    }

    public static void imprimirMatriz (String [][] matriz) throws FileNotFoundException{

        for(int linha = 0; linha < matriz.length;linha++){
            for (int coluna = 0; coluna < matriz[0].length; coluna++){
                System.out.println(matriz[linha][coluna] + "\t | \t") ;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws FileNotFoundException{
        
        
        /**
         * Menu Principal - Escolha do Tipo de Utilizador
         * Menu básico para o inicio do programa.
         */


         Scanner input = new Scanner(System.in);

         int opcao, passwordAdmin, menuCliente;

         do{
            System.out.println("Escolha o tipo de utilizador: ");

            System.out.println("1. Cliente");
            System.out.println("2. Administrador");
            System.out.println("3. Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:

                    // menuCliente();
                    break;

                case 2:
                    System.out.println("***  MENU ADMINISTRADOR ***");
                    passwordAdmin();


                    break;

        
                
                default:
                System.out.println("*****GameStart******\n Obrigada e até a próxima!");
                    break;

            }

         }while (opcao != 3); 

    }

    /**
     * Método para verificar se a senha esta ou não correta
     * ps.: Usado apenas pelo Admin
     * @throws FileNotFoundException
     */

    public static void passwordAdmin() throws FileNotFoundException{

        Scanner input = new Scanner (System.in);

        int menuA;

        String passwordCorreta = "skateordie", passwordString;

        System.out.println("Yo! Digite a sua senha");
        passwordString = input.nextLine();

        if(passwordString.equals(passwordCorreta)){

            System.out.println("Password Coreta!");
            menuA();
        }else {
            System.out.println("Nice try, mas a pass está errada");
        }
    }

   public static void menuA () throws FileNotFoundException{


       File

        Scanner input = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("**** MENU ADMINISTRADOR ****");
            System.out.println("Escolha a opção");

            System.out.println("1. Lista de jogos, clientes e vendas");
            System.out.println("2. Total de Vendas");
            System.out.println("3. Lucros $$");
            System.out.println("4. Dados do Cliente");
            System.out.println("5. Golden Game :)");
            opcao = input.nextInt();

            System.out.println("9. Sair, Bye!");

            switch (opcao){
                case 1:
                    System.out.println(" *** LISTA *** ");
                    imprimirMatriz(fichieroParaMatriz(matrizGS, ));

                    break;

            }
        }while (opcao != 9);



   }
    
}
