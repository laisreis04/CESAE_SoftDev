package Ex_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Escolha o tipo de documento");
            System.out.println("1. Texto Simples");
            System.out.println("2. Folha de Claculo");
            System.out.println("3. Apresentação");
            System.out.println("0. Sair");

            opcao = input.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("*****************************************");
                    System.out.print("Autor: ");
                    String autor = input.next();
                    System.out.print("Nome: ");
                    String nome = input.next();
                    System.out.print("Extensão [DOCX]: ");
                    Extensoes extensoes = Extensoes.valueOf(input.next());

                    TextoSimples texto = new TextoSimples(autor,nome,extensoes);
                    
                    texto.exibirDetalhes();
                    System.out.println("************************************");
                    break;
                case 2:
                    System.out.println("*****************************************");
                    System.out.print("Autor: ");
                    String autorC = input.next();
                    System.out.print("Nome: ");
                    String nomeC = input.next();
                    System.out.print("Extensão [XLSX]: ");
                    Extensoes extensoesC = Extensoes.valueOf(input.next());

                    FolhaCalculo folhaCalculo = new FolhaCalculo(autorC,nomeC,extensoesC);
                    folhaCalculo.exibirDetalhes();
                    System.out.println("************************************");
                    break;

                case 3:
                    System.out.println("*****************************************");
                    System.out.print("Autor: ");
                    String autorA = input.next();
                    System.out.print("Nome: ");
                    String nomeA = input.next();
                    System.out.print("Extensão [XLSX]: ");
                    Extensoes extensoesA = Extensoes.valueOf(input.next());

                    Apresentacao apresentacao1 = new Apresentacao(autorA,nomeA,extensoesA);
                    apresentacao1.exibirDetalhes();
                    System.out.println("************************************");
                    break;

            }
        }while (opcao!= 0);


    }
}
