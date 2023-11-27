package AirPlaneStore;

import java.sql.SQLOutput;

public class Aviao {

    //colocar todos os atributos do avião

    private String numSerie;
    private String modelo;
    private int anoFabrico;
    private int peso;
    private double compFusilagemM;
    private double envergaduraAsasM;
    private double alturaCauda;
    private int numMotores;
    private int autonomiaKm;
    private int veloMaximaKmH;
    private double preco;

    public Aviao(String numSerie, String modelo, int anoFabrico, int peso, double compFusilagemM, double envergaduraAsasM, double alturaCauda, int numMotores, int autonomiaKm, int veloMaximaKmH, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.compFusilagemM = compFusilagemM;
        this.envergaduraAsasM = envergaduraAsasM;
        this.alturaCauda = alturaCauda;
        this.numMotores = numMotores;
        this.autonomiaKm = autonomiaKm;
        this.veloMaximaKmH = veloMaximaKmH;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDetalhes(){

        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + anoFabrico);
        System.out.println("Peso: " + peso);
        System.out.println("Autonomia: " + autonomiaKm);
        System.out.println("Velocidade Máxima: " + veloMaximaKmH);

    }
}
