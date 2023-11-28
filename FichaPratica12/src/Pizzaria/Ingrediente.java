package Pizzaria;

import Pizzaria.Enum.Unidade_Medida;

public class Ingrediente {

    private String codigo;

    private String nome;

    private Unidade_Medida unidadeMedida;

    private double kcal;

    public Ingrediente(String codigo, String nome, Unidade_Medida unidadeMedida, double kcal) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.kcal = kcal;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getKcal() {
        return kcal;
    }


    public void exibirDetalhes_Ingredientes(){

        System.out.println("[ " + codigo + "| " + nome + "| " + kcal + "| ]");


    }
}
