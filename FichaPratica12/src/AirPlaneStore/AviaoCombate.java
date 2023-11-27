package AirPlaneStore;

import java.util.ArrayList;

public class AviaoCombate extends Aviao{

    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Armas> armas;

    public AviaoCombate(String numSerie, String modelo, int anoFabrico, int peso, double compFusilagemM, double envergaduraAsasM, double alturaCauda, int numMotores, int autonomiaKm, int veloMaximaKmH, double preco, String paisOrigem, boolean camuflagem, ArrayList<Armas> armas) {
        super(numSerie, modelo, anoFabrico, peso, compFusilagemM, envergaduraAsasM, alturaCauda, numMotores, autonomiaKm, veloMaximaKmH, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.armas = new ArrayList<>();
    }

    //adiconar armas
    public void addArma(Armas novaArma){

        //Verifico o tamanho do array
        if(armas.size()<3){
            this.armas.add(novaArma);
        }


    }

    // remover armas
    public void removeArma(int index){
        this.armas.remove(index);

    }

    //Listar armas
    public void listaArma(){
        System.out.println("Armas: ");
        System.out.println(armas);
        System.out.println();
    }

    public void exibirDetalhes_AviaoCombate(){
        super.exibirDetalhes();
        System.out.println("Pais de Origem: " +paisOrigem);
        this.listaArma();
        System.out.println();

    }


}
