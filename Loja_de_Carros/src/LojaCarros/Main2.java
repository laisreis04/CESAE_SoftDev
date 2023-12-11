package LojaCarros;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 {
    public static Veiculo criarVeiculo(){

        Scanner input = new Scanner(System.in);



        System.out.println("Escolha o tipo de veiculo:");
        System.out.println("1. Carro");
        System.out.println("2. Moto");
        System.out.println("3. Caminhão");

        int opcaoUser = input.nextInt();

        String marca;
        String modelo;
        int anoFabrico;
        int potencia;
        int cilindrada;
        TipoCombustivel tipoCombustivel=null;
        double consumo;

        System.out.println("***NOVO VEICULO***");

        System.out.print("Marca: ");
        marca = input.next();

        System.out.print("Modelo: ");
        modelo = input.next();

        System.out.print("Ano de Fabricação: ");
        anoFabrico = input.nextInt();

        System.out.print("Potência: ");
        potencia = input.nextInt();

        System.out.print("Cilindrada: ");
        cilindrada = input.nextInt();

        System.out.println("Selecione o tipo de combustivel:");
        System.out.println("1. GASOLINA");
        System.out.println("2. DIESEL");
        System.out.println("3. GPL");
        System.out.println("4. ELETRICO");
        int opcaoCombustivel = input.nextInt();

        switch (opcaoCombustivel) {
            case 1:
                tipoCombustivel = TipoCombustivel.GASOLINA;
                break;

            case 2:
                tipoCombustivel = TipoCombustivel.DIESEL;
                break;

            case 3:
                tipoCombustivel = TipoCombustivel.GPL;
                break;
            case 4:
                tipoCombustivel = TipoCombustivel.ELETRICO;
                break;

            default:
                System.out.println("Opção Inválida");
        }

        System.out.println("Consumo do veiculo (km/L): ");
        consumo = input.nextDouble();
        

        switch (opcaoUser){
            case 1:
                // n passageiros
                System.out.println("Quantidade de passageiros: ");
                int passageiros = input.nextInt();
                Carro carro1 = new Carro(marca,modelo,anoFabrico,potencia,cilindrada,tipoCombustivel,consumo,passageiros);

                return carro1;
            case 2:
                Mota mota1 = new Mota(marca,modelo,anoFabrico,potencia,cilindrada,tipoCombustivel,consumo);
                return mota1;
            case 3:
                System.out.println("Capacidade de carga (Caminhão): ");
                double capacidadeCarga = input.nextDouble();
                Caminhao caminhao1 = new Caminhao(marca, modelo, anoFabrico,potencia,cilindrada, consumo, capacidadeCarga);
                return caminhao1;
            default:
                return null;
        }


    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input= new Scanner(System.in);


            //Dentro da classe criar uma variavel para chamar o método de construção do objeto
            Veiculo veiculo=criarVeiculo();
            //Chamar o método dessa classe
            veiculo.exibirDetalhes();



            System.out.println("1. Criar veiculo");
            System.out.println("2. Calcular consumo");
            System.out.println("3. Fazer corrida Carro1");
            System.out.println("4. Fazer corrida Mota1");
            System.out.println("5. Fazer corrida Caminhão1");
            System.out.println("6. Se caminhão, permite calcular custos viagem de transporte de carga");
            System.out.println("7. Se mota imprime imagem");

        int opcao = input.nextInt();

            switch (opcao){
                case 1:
                    criarVeiculo();
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                default:


            }



    }
}
