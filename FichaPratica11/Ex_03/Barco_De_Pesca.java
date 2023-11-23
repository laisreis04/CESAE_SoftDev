package Ex_03;

import java.util.ArrayList;

public class Barco_De_Pesca {

    private String nome;
    private String cor;
    private String anoFabrico;

    private  int populacao;

    private double capacidadeCargaKg;

    private ArrayList<Peixe> peixes;

    public Barco_De_Pesca(String nome, String cor, String anoFabrico, int populacao, double capacidadeCargaKg) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.populacao = populacao;
        this.capacidadeCargaKg = capacidadeCargaKg;
        this.peixes = new ArrayList<>();
    }

//    public void pescarPeixe(Peixe pesoPeixe){
//
//        //Onde eu vou acessar os peixes que foram pescados
//        ArrayList<Peixe> peixes = this.peixes;
//        double pesoTotal_Pescados = pesoPeixe + this.
//
//
//    }

}
