package Ex_03;

import java.util.ArrayList;

public class Marisco {

    private String especie;
    private double peso;

    private double precoKg;

   private ArrayList<Marisco> mariscosPescados;

    private double somarPeso_Marisco = 0;


    public Marisco(String especie, double peso, double precoKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoKg = precoKg;
        this.mariscosPescados = new ArrayList<>();
    }

    //LIsta GETTER
    public double getPeso() {
        return peso;
    }

    public double getPrecoKg() {
        return precoKg;
    }

    public double getSomarPeso_Marisco() {
        return somarPeso_Marisco;
    }

    public void addMarisco(Marisco novoMarisco){

        this.mariscosPescados.add(novoMarisco);
    }



}
