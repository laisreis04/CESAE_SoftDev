package Ex_03;

import java.util.ArrayList;

public class Barco_De_Pesca {

    private String nome;
    private String cor;
    private String anoFabrico;

    private Marca marcaBarco;

    private  int populacao;

    private double capacidadeCargaKg;

    private ArrayList<Peixe> peixes;
    private ArrayList<Marisco> marisco;



    public Barco_De_Pesca(String nome, String cor, String anoFabrico, int populacao, double capacidadeCargaKg, Marca marcaBarco) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.populacao = populacao;
        this.capacidadeCargaKg = capacidadeCargaKg;
        this.marcaBarco = marcaBarco;
        this.peixes = new ArrayList<>();
        this.marisco = new ArrayList<>();
    }

    public void exibirDados_Barco(){

        System.out.println("Nome: " + nome + "| Tripulantes: " + populacao + "| Capacidade: " + capacidadeCargaKg);

    }


    /**
     * Método para somar a carga total no barco
     * @return a carga atualizada do barco
     */
    public double getCargaAtual(){

        double cargaAtual = 0;

        for(Peixe peixeAtual: this.peixes){
            cargaAtual +=peixeAtual.getPeso();

        }
        for ( Marisco mariscoAtual: this.marisco){
            cargaAtual += mariscoAtual.getPeso();

        }
        return cargaAtual;
    }

    public void pescarPeixe(Peixe novoPeixe){


        if(capacidadeCargaKg < novoPeixe.getPeso() + this.getCargaAtual()){


        }else {
            System.out.println("Adiconou Peixe");
            this.peixes.add(novoPeixe);
        }


    }

    public void pescarMarisco (Marisco adicionarMarisco){


        if(capacidadeCargaKg < adicionarMarisco.getPeso() + this.getCargaAtual()){

        }else {
            System.out.println("Adicionou Marisco");
            this.marisco.add(adicionarMarisco);
        }

    }

    public void removeLargarPeixe (Peixe soltarPeixe){

        System.out.println("Bye peixinho..");
        this.peixes.remove(soltarPeixe);

    }

    public void removeLargarMarisco (Peixe soltarMarisco){

        this.marisco.remove(soltarMarisco);

    }

    public double calcular_PrecoTotal(){

        double precoTotal = 0;

        for(Peixe peixeAtaul : this.peixes){
            double precoPeixeAtual = peixeAtaul.getPeso()*peixeAtaul.getPrecoKg();
            precoTotal += precoPeixeAtual;

        }
        for(Marisco mariscoAtaul : this.marisco){
            double precoMariscoAtual = mariscoAtaul.getPeso()*mariscoAtaul.getPrecoKg();
            precoTotal += precoMariscoAtual;

        }
        return precoTotal;

    }

    public double salarioTripulaao(){
        double salario = this.calcular_PrecoTotal();

        salario *=0.6;

        return salario/this.populacao;

    }


}
