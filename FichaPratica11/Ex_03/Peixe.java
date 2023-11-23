package Ex_03;

import java.util.ArrayList;

public class Peixe {

    private String especie;
    private double peso;

    private double precoKg;

    public Peixe(String especie, double peso, double precoKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoKg = precoKg;
        this.peixesPescados = peixesPescados;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecoKg() {
        return precoKg;
    }

    ArrayList<Peixe> peixesPescados;

    public void addPeixe(Peixe novoPeixe){

        this.peixesPescados.add(novoPeixe);
    }

}
