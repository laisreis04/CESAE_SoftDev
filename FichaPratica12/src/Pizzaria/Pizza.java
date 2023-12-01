package Pizzaria;

import Pizzaria.Enum.BasePizza;
import Pizzaria.Enum.Tamanho;
import Pizzaria.Ingredientes.Base;
import Pizzaria.Ingredientes.Ingrediente;
import Pizzaria.Ingredientes.Topping;

import java.util.ArrayList;

public class Pizza {

    private String codigoPizza;

    private String nome;
    private String descricao;
    private double preco;
    private Tamanho tamanho;

    private ArrayList<Ingrediente_Pizza> composicao;

    public Pizza(String codigoPizza, String nome, String descricao, double preco, Tamanho tamanho) {
        this.codigoPizza = codigoPizza;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.composicao = new ArrayList<>();
    }


    /**
     * Método para verificar se a pizza tem ou não base
     * @return
     */
    public boolean temBase(){
        //Contador de bases
        int contadorbases = 0;

        //para ler all the array
        for (Ingrediente_Pizza ingredientePizzaAtual : composicao){

            //condição para verificar se nos Ingredientes_Pizza algum é instacia da Base
            if (ingredientePizzaAtual.getIngredientes() instanceof Base){

                //Contar a base e colocar uma condição
                contadorbases++;
                if(contadorbases < 1){
                    return true;
                }

            }
        }
        return false;
    }

    /**
     * Método para contar o número de Toppings
     * @return número de toppings
     */
    public int contarTopping (){

        //Iniciar contador
        int contadorTopping = 0;

        for(Ingrediente_Pizza ingredientePizzaAtual : composicao){
            if(ingredientePizzaAtual.getIngredientes() instanceof Topping){
            contadorTopping++;
            }
        }
    return contadorTopping;
    }

    /**
     *
     * Método para adicionar ingredientes
     * @param novoIngrediente
     */
    public void addIngredientes(Ingrediente_Pizza novoIngrediente){

        //Contador Topping
        int contadorToppings = 0;


        if(novoIngrediente.getIngredientes() instanceof Topping && temBase()){
                if(composicao.size() <= 4 && contarTopping()<=4){
                        composicao.add(novoIngrediente);
                    }
                }
        }

//        public void definirTipoPizza (Ingrediente_Pizza tipoPizza){
//
//        for (Ingrediente_Pizza ingredientePizzaatual :composicao){
//
//            if()
//        }
//
//        }

    /**
     * Metodo para mudar a quantidade de um ingrediente_Pizza
     * @param ingrediente
     * @param novaQuantidade
     */
    public void editarQuantidade(Ingrediente ingrediente, double novaQuantidade){

        for ( Ingrediente_Pizza ingredienteAtual: composicao){

            if (ingredienteAtual.getIngredientes()==ingrediente){
            ingredienteAtual.setQuantidade(novaQuantidade);
            }
        }
    }

    public void removeIngrediente(String codigoIngrediente){

        for(Ingrediente_Pizza ingredienteAtual : composicao){
            if(ingredienteAtual.getIngredientes().getCodigo().equals(codigoIngrediente)){
                composicao.remove(ingredienteAtual);
                System.out.println("Ingrediente Removido!");
            }

        }
    }

    public void exibirDetalhes_Pizza(){
        int contador = 1;

        System.out.println("********* PIZZARIA VEGANS *********");
        System.out.println("Código: " + codigoPizza);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: " + preco);
        System.out.println("Tamanho: " + tamanho);
        for (Ingrediente_Pizza ingredientePizzaAtual : composicao){
            System.out.print("Ingrediente " + contador++ + ":");
            ingredientePizzaAtual.exbibirDetalhes_Ingredientes_pizza();
        }
        System.out.println();
    }


    public double kcalPor_Ingrediente ( Ingrediente nomeIngrediente, double quantidadeDesejada){

        double totalKcal_Ingrediente = nomeIngrediente.getKcal() * quantidadeDesejada;
        return totalKcal_Ingrediente;


    }
    public double kcal_Pizza (){

        double kCalTotal = 0;

       for (Ingrediente_Pizza ingredientePizzaAtual : composicao){

           double quantidade_ingrediente = ingredientePizzaAtual.getQuantidade();
           double kcalPorquantidadeIngrediente = ingredientePizzaAtual.getIngredientes().getKcal();

           double kcalIngredienteAtual = quantidade_ingrediente * kcalPorquantidadeIngrediente;
           kCalTotal += kcalIngredienteAtual;
       }
        return kCalTotal;
    }






    }
