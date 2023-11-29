package Pizzaria;

import Pizzaria.Enum.OrigemIngrediente;
import Pizzaria.Enum.TipoVegetal;
import Pizzaria.Enum.Unidade_Medida;

public class Vegetal extends Topping{

    private TipoVegetal tipoVegetal;

    public Vegetal(String codigo, String nome, Unidade_Medida unidadeMedida, double kcal, OrigemIngrediente origem, TipoVegetal tipoVegetal) {
        super(codigo, nome, unidadeMedida, kcal, origem);
        this.tipoVegetal = tipoVegetal;
    }

    public TipoVegetal getTipoVegetal() {
        return tipoVegetal;
    }
}
