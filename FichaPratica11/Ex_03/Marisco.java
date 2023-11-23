package Ex_03;

import java.util.ArrayList;

public class Marisco {

    private String especie;
    private double peso;

    private double precoKg;

    ArrayList<Marisco> mariscosPescados;


    public Marisco(String especie, double peso, double precoKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoKg = precoKg;
        this.mariscosPescados = mariscosPescados;
    }

    //LIsta GETTER
    public double getPeso() {
        return peso;
    }

    public double getPrecoKg() {
        return precoKg;
    }
}
