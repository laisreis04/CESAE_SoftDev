package Pizzaria;

import Pizzaria.Enum.OrigemIngrediente;
import Pizzaria.Enum.TipoQueijo;
import Pizzaria.Enum.Unidade_Medida;

public class Queijo extends Topping{

    private TipoQueijo tipoQueijo;

    public Queijo(String codigo, String nome, Unidade_Medida unidadeMedida, double kcal, OrigemIngrediente origem, TipoQueijo tipoQueijo) {
        super(codigo, nome, unidadeMedida, kcal, origem);
        this.tipoQueijo = tipoQueijo;
    }

    public TipoQueijo getTipoQueijo() {
        return tipoQueijo;
    }
}
