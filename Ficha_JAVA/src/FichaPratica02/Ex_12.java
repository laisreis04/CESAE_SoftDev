package FichaPratica02;

import java.util.Scanner;

public class Ex_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    int opcUser;

    System.out.print("Menu: \nOpção 1 - Criar\n Opção 2 - Atualizar\n Opção 3 - Eliminar\n Opção 4 - Sair\n Selecione a sua opção: ");
    opcUser = input.nextInt();

    switch (opcUser){
        case 1:
            System.out.print("Criar selecionado" );
            break;

        case 2:
            System.out.print("Atualizar selecionado"  );
            break;

        case 3:
            System.out.print("Eliminar selecionado"  );
            break;

        case 4:
            break;

        default:
            System.out.print("Opção inválida");
            break;


    }

    }
}
