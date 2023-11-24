package Ex_03;

import java.util.ArrayList;

public class Peixe {

    private String especie;
    private double peso;

    private double precoKg;

    private ArrayList<Peixe> peixesPescados;

    private double somarPeso_Peixe = 0;

    public Peixe(String especie, double peso, double precoKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoKg = precoKg;
        this.peixesPescados = new ArrayList<>();
    }


    //LISTA GETTERS
    public double getPeso() {
        return peso;
    }

    public double getPrecoKg() {
        return precoKg;
    }

    public double getSomarPeso_Peixe() {
        return somarPeso_Peixe;
    }




    /**
     * Método para adicionar Peixe
     * @param novoPeixe
     */
    public void addPeixe(Peixe novoPeixe){

        this.peixesPescados.add(novoPeixe);
    }




}
