package AirPlaneStore;

import java.util.ArrayList;

public class Catalogo extends Aviao {

    private ArrayList<Aviao> catalogoavioes;

    public Catalogo(String numSerie, String modelo, int anoFabrico, int peso, double compFusilagemM, double envergaduraAsasM, double alturaCauda, int numMotores, int autonomiaKm, int veloMaximaKmH, double preco, ArrayList<Aviao> avioes) {
        super(numSerie, modelo, anoFabrico, peso, compFusilagemM, envergaduraAsasM, alturaCauda, numMotores, autonomiaKm, veloMaximaKmH, preco);
        this.catalogoavioes = new ArrayList<>();
    }

    //Comprar

    public void comprarAviao(Aviao novoAviao){

        this.catalogoavioes.add(novoAviao);
    }

    //Vender
    public void venderAviao(int index){
        this.catalogoavioes.remove(index);

    }


    //Calcular valor dos aviões

    public double calcularValorTotal(){

        double valorCatalogo = 0;

        for(Aviao aviaAtual : this.catalogoavioes){
            valorCatalogo += aviaAtual.getPreco();
        }
        return valorCatalogo;

    }

    //Imprimir Catalago

    public void exibirDetalhes_Catalogo(){

        System.out.println("******* Catalogo ********");

        for(Aviao aviaoAtual : this.catalogoavioes){

            if(aviaoAtual instanceof JatoPrivado){
                JatoPrivado jatoPrivadoAtual = (JatoPrivado) aviaoAtual;
                jatoPrivadoAtual.exibirDetalhes_JatoParticular();
            }
            if(aviaoAtual instanceof AviaoCombate){
                AviaoCombate aviaoCombateAtual = (AviaoCombate) aviaoAtual;
                aviaoCombateAtual.exibirDetalhes_AviaoCombate();

            }


        }

    }



}
