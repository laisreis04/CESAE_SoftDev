package Ex_02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("****BIENVINIDO*****\n\nRESTAUTANTE LOS TACOS DE LA OSTIA TIO");
            System.out.println("\n\nEscolha o seu Taco:");
            System.out.println("\n1. MUCHA CARNE");
            System.out.println("\n2. MUCHO FRANGO");
            System.out.println("\n3. MUY VEGAN");
            System.out.println("\n0.Sair");
            System.out.println("*************************************************************");
            opcao = input.nextInt();


            switch (opcao){
                case 1:
                    Carne taco1 = new Carne();
                    taco1.prepare();
                    taco1.bake();
                    taco1.box();
                    System.out.println();
                    break;
                case 2:
                    Frango tacoF = new Frango();
                    tacoF.prepare();
                    tacoF.bake();
                    tacoF.box();
                    System.out.println();
                    break;
                case 3:
                    Vegan tacoV = new Vegan();
                    tacoV.prepare();
                    tacoV.bake();
                    tacoV.prepare();
                    System.out.println();
                    break;

                default:
                    System.out.println("Isso são tacos e não Mariaches");
            }
        }while (opcao!=0);

    }

}
