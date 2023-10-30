package FichaPratica04;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int opcao;


        do{
            
        System.out.println("Menu \n Digite um número da sua opção: \n 1 - Criar\n 2 - Atualizar\n 3 - Eliminar\n 4 - Sair\n Sua opção:");
        opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Criar selecionado");
                    break;
                case 2:
                    System.out.println("Atualizar selecionado");
                    break;
                case 3:
                    System.out.println("Eliminar selecionado");
                    break;
            
                default:
                System.out.println("Sair");
                    break;
            }
        }while(opcao < 4);
    }
}
