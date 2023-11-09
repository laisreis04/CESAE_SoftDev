package FichaPratica06;

import static FichaPratica06.Ex_03.*;

import java.util.Scanner;

public class Ex_04 {

        public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);

            int num, opcao;

            System.out.println("Digite um número, e aseguir escolhe uma opção. \nSeu número: ");
            num = input.nextInt();

            do{
                System.out.println("1. Par ou impar");
                System.out.println("2. Positivo ou negativo");
                System.out.println("3. Primo ou não primo");
                System.out.println("4. Perfeito ou não perfeito");
                System.out.println("5. Triangular ou não triangular");
                System.out.println("6. Trocar de número");

                System.out.println("\n7. Sair");
                opcao = input.nextInt();


                switch (opcao) {
                    case 1:
                        if(par(num)){
                            System.out.println("É par !!\n");
                        }else{
                            System.out.println("Impar\n");
                        }
                        break;

                    case 2:
                    if (positivo(num)) {
                        System.out.println("É positivo\n");
                    }else{
                        System.out.println("É negativo\n");
                    }
                    break;

                    case 3:
                    if (primo(num)) {
                        System.out.println("É primo\n");
                    }else{
                        System.out.println("Não é primo\n");
                    }
                    break;

                    case 4:
                    if (perfeito(num)) {
                        System.out.println("Uau esse numero é perfeito\n");
                    }else{
                        System.out.println("Bruuu, não é perfeito\n");
                    }
                    break;
                    
                    case 5:
                    if (triangular(num)) {
                        System.out.println("SIM !! É triangular!\n");
                    }else{
                        System.out.println("Opa... não é triangular\n");
                    }
                    break;

                    case 6:
                        System.out.println("Escolha uma nova opção: ");
                        num = input.nextInt();
                        break;

                    case 7:
                        System.out.println("Valeu, até a próxima!! ");

                        break;

                
                    default:
                        System.out.println("Opção inválida\n");
                        break;
                }
            

            }while(opcao != 7);

        }


}
