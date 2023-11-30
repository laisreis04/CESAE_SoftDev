package Pizzaria.Ingredientes;

import Pizzaria.Enum.BasePizza;
import Pizzaria.Enum.Unidade_Medida;

public class Base extends Ingrediente {

        private BasePizza tipoBase;

        private String descricao;



    public Base(String codigo, String nome, Unidade_Medida unidadeMedida, double kcal, BasePizza tipoBase, String descricao) {
        super(codigo, nome, unidadeMedida, kcal);
        this.tipoBase = tipoBase;
        this.descricao = descricao;

    }

//    public void unidadeMedidaBase(){
//
//        if(base.equals(BasePizza)){
//            System.out.println("g.");
//        }
//
//
//    }


    public BasePizza getTipoBase() {
        return tipoBase;
    }
}
