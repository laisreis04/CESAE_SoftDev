package Pizzaria.Ingredientes;

import Pizzaria.Enum.OrigemIngrediente;
import Pizzaria.Enum.Unidade_Medida;

public class Topping extends Ingrediente{

    private OrigemIngrediente origem;



    public Topping(String codigo, String nome, Unidade_Medida unidadeMedida, double kcal, OrigemIngrediente origem) {
        super(codigo, nome, unidadeMedida, kcal);
        this.origem = origem;

    }

    public OrigemIngrediente getOrigem() {
        return origem;
    }
}
