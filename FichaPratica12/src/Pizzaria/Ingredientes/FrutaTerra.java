package Pizzaria.Ingredientes;

import Pizzaria.Enum.OrigemIngrediente;
import Pizzaria.Enum.TipoFruta;
import Pizzaria.Enum.Unidade_Medida;

public class FrutaTerra extends Topping{

    private TipoFruta tipoFruta;

    public FrutaTerra(String codigo, String nome, Unidade_Medida unidadeMedida, double kcal, OrigemIngrediente origem, TipoFruta tipoFruta) {
        super(codigo, nome, unidadeMedida, kcal, origem);
        this.tipoFruta = tipoFruta;
    }

    public TipoFruta getTipoFruta() {
        return tipoFruta;
    }
}
