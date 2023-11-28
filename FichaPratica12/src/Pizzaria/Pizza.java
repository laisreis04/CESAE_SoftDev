package Pizzaria;

import Pizzaria.Enum.Tamanho;

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

    public void addIngredientes(Ingrediente_Pizza novoIngrediente){

        if(composicao.size() < 5){
            composicao.add(novoIngrediente);
        }

    }

    public void editarQuantidade(Ingrediente_Pizza novoIngrediente, double quantidade){
        for ( Ingrediente_Pizza ingredienteAtual: composicao){
            if (ingredienteAtual.getIngredientes().equals(Ingrediente)){

            }
        }
    }

    public void removeIngrediente(String codigoIngrediente){

        for(Ingrediente_Pizza ingredienteAtual : composicao){
            if(ingredienteAtual.getIngredientes().equals(codigoIngrediente)){
                composicao.remove(ingredienteAtual);
                System.out.println("Ingrediente Removido!");
            }

        }
    }

    public void exibirDetalhes_Pizza(){

        System.out.println("********* PIZZARIA VEGANS *********");
        System.out.println("Código: " + codigoPizza);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: " + preco);
        System.out.println("Tamanho: " + tamanho);
        for (Ingrediente ingredienteAtual : composicao){

        }
    }


    public double kcalPor_Ingrediente ( Ingrediente nomeIngrediente, double quantidadeDesejada){

        double totalKcal_Ingrediente = nomeIngrediente.getKcal() * quantidadeDesejada;
        return totalKcal_Ingrediente;


    }
    public void kcal_Pizza (){

        double totalKcal = 0;
        for ( Ingrediente kcalAtual : composicao){

            totalKcal += kcalAtual.getKcal();
        }

    }


}
