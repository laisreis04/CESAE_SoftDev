package Pizzaria;

import Pizzaria.Enum.OrigemIngrediente;
import Pizzaria.Enum.TipoCarneVegetal;
import Pizzaria.Enum.Unidade_Medida;

public class CarneVegana extends Topping{

    private TipoCarneVegetal tipoCarneVegetal;

    public CarneVegana(String codigo, String nome, Unidade_Medida unidadeMedida, double kcal, OrigemIngrediente origem, TipoCarneVegetal tipoCarneVegetal) {
        super(codigo, nome, unidadeMedida, kcal, origem);
        this.tipoCarneVegetal = tipoCarneVegetal;
    }

    public TipoCarneVegetal getTipoCarneVegetal() {
        return tipoCarneVegetal;
    }
}
