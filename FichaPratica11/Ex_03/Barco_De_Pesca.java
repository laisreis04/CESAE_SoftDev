package Ex_03;

import java.util.ArrayList;

public class Barco_De_Pesca {

    private String nome;
    private String cor;
    private String anoFabrico;

    private  int populacao;

    private double capacidadeCargaKg;

    private ArrayList<Peixe> peixes;
    private ArrayList<Marisco> marisco;

    public Barco_De_Pesca(String nome, String cor, String anoFabrico, int populacao, double capacidadeCargaKg) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.populacao = populacao;
        this.capacidadeCargaKg = capacidadeCargaKg;
        this.peixes = new ArrayList<>();
        this.marisco = new ArrayList<>();
    }

    public void exibirDados_Barco(){

        System.out.println("Nome: " + nome + "| Tripulantes: " + populacao + "| Capacidade: " + capacidadeCargaKg);

    }

    public void addPescarPeixe(Peixe adiconarPeixe){


        if(capacidadeCargaKg > adiconarPeixe.getPeso()){
            capacidadeCargaKg -= adiconarPeixe.getPeso();
            System.out.println("Uhuul mais um");
            this.peixes.add(adiconarPeixe);
        }else {
            System.out.println("Excedeu o peso!!!");
        }


    }

    public void addPescarMarisco (Marisco adicionarMarisco){
        if(capacidadeCargaKg < adicionarMarisco.getPeso()){
            this.marisco.add(adicionarMarisco);
        }else {
            System.out.println("Excedeu o peso do barco!");
        }

    }

    public void removeLargarPeixe (Peixe soltarPeixe){

        System.out.println("Bye peixinho..");
        this.peixes.remove(soltarPeixe);

    }

    public void removeLargarMarisco (Peixe soltarMarisco){

        this.marisco.remove(soltarMarisco);

    }

    public void totalPescado(Barco_De_Pesca ){

        //peixe

        double valorTotal = this.peixes.;
        System.out.println("Valor total = " + valorTotal);
    }

}
