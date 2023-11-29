package Pizzaria;

import java.util.ArrayList;

public class Ingrediente_Pizza {

    private Ingrediente ingredientes;

    private double quantidade;

    public Ingrediente_Pizza(Ingrediente ingrediente, double quantidade) {
        this.ingredientes = ingrediente;
        this.quantidade = quantidade;
    }

    public Ingrediente getIngredientes() {
        return ingredientes;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void exbibirDetalhes_Ingredientes_pizza(){

        ingredientes.exibirDetalhes_Ingredientes();
        System.out.println(": " + quantidade + " ");

        switch (this.ingredientes.getUnidadeMedida()){

            case GRAMAS:
                System.out.println("g.");
            break;
            case LITROS:
                System.out.println("L.");
                break;
            case UNIDADES:
                System.out.println("uni.");
                break;

        }
    }
}
