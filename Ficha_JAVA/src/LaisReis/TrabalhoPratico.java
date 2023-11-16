package LaisReis;

import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.File;

public class TrabalhoPratico {


    /**
     * CONTAR COLUNA
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
     * CONTAR LINHA
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
     * FICHIERO -> MATRIZ
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

    /**
     * IMPRESSORA
     * Método para imprimir o coneteúdo da Matriz
     * @param matriz
     * @throws FileNotFoundException
     */
    public static void imprimirMatriz (String [][] matriz) throws FileNotFoundException{

        for(int linha = 0; linha < matriz.length;linha++){
            for (int coluna = 0; coluna < matriz[0].length; coluna++){
                System.out.print(matriz[linha][coluna] + "\t | \t") ;
            }
            System.out.println();
        }

    }

    /**
     * TOTAL DE VENDAS $$$
     * Método para calcular o valor total em vendas
     * @param matrizTotal
     * @return
     * @throws FileNotFoundException
     */
    public static double calcularTotalVendas (String[][] matrizTotal) throws FileNotFoundException{


        double soma=0;

        for(int linha = 0; linha < matrizTotal.length;linha++){
            String[] valorJogos = matrizTotal[linha][8].split(".");

            //transformar em euros e centavos para depois somar

            double euros = Double.parseDouble(matrizTotal[0][8]);
            double centavos = Double.parseDouble(matrizTotal[1][8]);


            soma += euros + centavos ;
        }

        System.out.print("Valor total de vendas: " + soma + "€\n\n");
        return soma;
    }

    /**
     * CALCULAR LUCRO $$$
     * Método utilizado para calcular o lucro da empresa
     * @param matrizTotal
     * @return
     * @throws FileNotFoundException
     */
    public static double totalLucros (String[][] matrizTotal) throws FileNotFoundException{

        double soma=0;

        for(int linha = 0; linha < matrizTotal.length;linha++){
            String[] valorJogos = matrizTotal[linha][8].split(".");

            //transformar matrizes em doubles

            double euros = Double.parseDouble(matrizTotal[0][8]);
            double centavos = Double.parseDouble(matrizTotal[1][8]);


            soma += euros + centavos;

        }

        System.out.print("Total lucro: " + soma*0.2 + "€\n\n");
        return soma;
    }

    /**
     * PROCURAR PELO ID DO CLIENTE
     * Método para procuar pelo ID do cliente
     * @param matrizTotal
     * @param idCliente
     * @throws FileNotFoundException
     */
    public static void procurarIdCliente (String [][] matrizTotal, String idCliente) throws FileNotFoundException{


        //(for) - usado para ir de linha em linha para verificar todos os ID's

            for(int linha = 0;linha < matrizTotal.length;linha++){
                if(matrizTotal[linha][1].equals(idCliente)){

                    //Impressão do resultado da procura
                    System.out.println("Nome: "+ matrizTotal[linha][2] +  "\nContato:"+ matrizTotal[linha][3] + "\nEmail: "+ matrizTotal[linha][4]);
                    break;
                }
            }
    }

    /**
     * JOGO MAIS CARO
     * Método usado para verificar qual o jogo mais caro
     * @param matrizTotal
     * @throws FileNotFoundException
     */
    public static void jogoMaisCaro (String[][] matrizTotal) throws FileNotFoundException{

    double valorJogo = 0, jogoMaisCaro;
    String nomeAtual = "";

    for (int linha = 0; linha < matrizTotal.length;linha++){
        String jogoAtual = matrizTotal[linha][7];

        //transformar a string em double

        jogoMaisCaro = Double.parseDouble(matrizTotal[linha][8]);

        //Verificar qual o jogo mais caro
        if (valorJogo < jogoMaisCaro){
            valorJogo = jogoMaisCaro;
            nomeAtual = jogoAtual;
        }
    }
        System.out.println("O tesourinho da loja é: " + nomeAtual + "\nValor: " + valorJogo );

    }



    /**
     * ESTACIONAMENTO
     * Método para verificar os numeros triangulares
     * @throws FileNotFoundException
     */
    public static void estacionamentoCliente()throws FileNotFoundException{

       int soma = 0, num= 0;
       
        while(num <= 121){
            for(int tri = 1; soma < num; tri++){
                soma += tri;
                if(soma == num && soma % 5 == 0){
                    System.out.println(num);
                }
            }
        }
            
        }

        
        

    /**
     * MENU PRINCIPAL
     * Main para a menu principal e iniciar o programa
     * @param args
     * @throws FileNotFoundException
     */

    public static void main(String[] args) throws FileNotFoundException{

         Scanner input = new Scanner(System.in);

         int opcao;

         do{
             System.out.println("**********************************\n**********************************\n\n--------*** GAME START ***--------\n\n**********************************\n**********************************");
            System.out.println("Escolha o tipo de utilizador: ");

            System.out.println("1. Cliente");
            System.out.println("2. Administrador");
            System.out.println("3. Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:

                    menuCliente();
                    break;

                case 2:
                    System.out.println("\n**********************************\n\n***  MENU ADMINISTRADOR ***\n\n**********************************");
                    passwordAdmin();


                    break;

        
                
                default:
                System.out.println("*****GameStart******\n Obrigada e até a próxima!");
                    break;

            }

         }while (opcao != 3); 

    }

    /**
     * PASSWORD
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

    /**
     * MENU ADMINISTRADOR
     * Menu do Adminitrador depois de usar a senha correta
     * @throws FileNotFoundException
     */

    public static void menuA () throws FileNotFoundException{


       String[][] matrizTotal = fichieroParaMatriz("Ficha_JAVA/Ficheiros_07/GameStart_V2.csv");

        Scanner input = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("\n**** MENU ADMINISTRADOR ****\n");
            System.out.println("Escolha a opção\n");

            System.out.println("1. Lista de jogos, clientes e vendas");
            System.out.println("2. Total de Vendas");
            System.out.println("3. Lucros $$");
            System.out.println("4. Procurar cliente pelo ID");
            System.out.println("5. Tesourinho da GameStart :)");
            System.out.println("9. Sair, Bye!");
            opcao = input.nextInt();



            switch (opcao){
                case 1:
                    System.out.println(" \n*** LISTA ***\n ");
                    imprimirMatriz(matrizTotal);

                    break;

                case 2:
                    System.out.println("\n*** TOTAL EM VENDAS ***\n");
                    calcularTotalVendas(matrizTotal);
                    break;

                    case 3:
                        System.out.println("\n*** TOTAL DE LUCROS ***\n");
                        totalLucros(matrizTotal);
                        break;

                case 4:
                    System.out.println("\n*** PROCURAR CLIENTE ***\n");
                    System.out.print("Digite o ID do cliente: ");
                    input.nextLine();
                    String idCliente = input.nextLine();

                    procurarIdCliente(matrizTotal, idCliente);
                    break;

                case 5:
                    jogoMaisCaro(matrizTotal);
                        break;

                case 9:
                    System.out.println("**** HASTA LA VISTA BABY ****");
                    break;

                default:
                    System.out.println("Opção Inválida Dummy !");
                    break;
            }
        }while (opcao != 9);

   }

    /**
     * MENU CLIENTE
     * Menu direcionado para o cliente.
     * @throws FileNotFoundException
     */
   public static void menuCliente() throws FileNotFoundException{

       Scanner input = new Scanner(System.in);

       int opcao;


       do{
           System.out.println("\n**********************\n**********************\n**** WELCOME ABOARD ****\n\n**********************\n**********************");

           System.out.println("1. Insirir novo cliente");
           System.out.println("2. Estacionamento");
           System.out.println("3. Mostrar lista de jogos");
           System.out.println("4. Procurar editora");
            opcao = input.nextInt();

           switch (opcao){

               case 1:
                   System.out.print("Nome: ");
                   String nomeCliente = input.nextLine();
                   nomeCliente = input.nextLine();

                   System.out.print("Contato: ");
                   long contatoCliente =input.nextInt();


                   System.out.print("Email: ");
                   String emailCliente = input.next();

                   System.out.print("\nYeah! dados inseridos com sucesso!\n\n Nome: " + nomeCliente + "\nContato: " + contatoCliente + "\nEmail: " +emailCliente + "\n");

                   break;

               case 2:
                   estacionamentoCliente();
                   break;
           }
       }while (opcao != 9);

   }
    
}
