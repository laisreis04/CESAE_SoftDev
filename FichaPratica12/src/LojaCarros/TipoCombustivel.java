package LojaCarros;

public enum TipoCombustivel {

    GASOLINA, DIESEL, GLP, ELETRICO;

    public double precoLitro_Combustivel(double litrosCombustivel){

        if(this == GASOLINA){
            return litrosCombustivel * 2.10;
        }else if(this == DIESEL){
            return litrosCombustivel * 1.95;
        }else if (this == GLP){
            return litrosCombustivel * 1.15;
        }else if (this == ELETRICO){
     return litrosCombustivel * 0.12;
    }
        return 0;
    }


}
