package Ex_03;

public class Animal {

        private String nome;
        private String especie;
        private String paisOrigem;
        private double pesoKg;
        private String[] alimentacao;

    public Animal(String nome, String especie, String paisOrigem, double pesoKg, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.pesoKg = pesoKg;
        this.alimentacao = alimentacao;
    }

    public void exibirDados(){

        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + pesoKg);
        System.out.println("País de origem: " + paisOrigem);
        System.out.println("Dieta: ");


            //Imprimir arrays
        for (int i = 0; i< alimentacao.length;i++){
            System.out.print(alimentacao[i] + " ");
        }
    }

    /**
     * Metodo para verificar se o animel comeu  + o peso atual se for positivo
     * @param pesoGr Peso pedido como parametro é em gramas.
     * @param comida
     */
    public void animalComer(double pesoGr, String comida){

        //Pergunta??? Como eu faço para imprimir apenas uma vez =

        for(int i = 0; i < alimentacao.length;i++){
            //O problema da impressao duplicada pode ser pela ordem ?
            if(comida.equals(alimentacao[i])){
                pesoKg += pesoGr/1000;

                return;
                // break ?
            }
              
            }
        System.out.println("Animal comeu!" + "\nPeso atual: " + pesoKg + "Kg");
            
        }


    }

