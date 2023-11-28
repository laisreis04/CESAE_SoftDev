package Pizzaria;

import java.util.ArrayList;

public class Ingrediente_Pizza {

    private ArrayList<Ingrediente> ingredientes;

    private double quantidade;

    public Ingrediente_Pizza(Ingrediente ingrediente, double quantidade) {
        this.ingredientes = new ArrayList<>();
        this.quantidade = quantidade;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}
