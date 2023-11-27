package AirPlaneStore;

import java.util.ArrayList;

public class JatoPrivado extends Aviao{

    private int lotacao;
    private int capacidadeBagagem;
    private Categoria categoria;

    private ArrayList<Instalacao> instalacao;


    public JatoPrivado(String numSerie, String modelo, int anoFabrico, int peso, double compFusilagemM, double envergaduraAsasM, double alturaCauda, int numMotores, int autonomiaKm, int veloMaximaKmH, double preco, int lotacao, int capacidadeBagagem, Categoria categoria, ArrayList<Instalacao> instalacao) {
        super(numSerie, modelo, anoFabrico, peso, compFusilagemM, envergaduraAsasM, alturaCauda, numMotores, autonomiaKm, veloMaximaKmH, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        this.instalacao = new ArrayList<>();
    }

    public void addInstalacoes(Instalacao novaInstacacao){
        this.instalacao.add(novaInstacacao);
    }

    public void removeInstalacoes (int index){
        this.instalacao.remove(index);

    }

    public void listarInstalacoes(){

        System.out.println("Instalações: ");
        System.out.println(this.instalacao);
        System.out.println();

    }

    public void exibirDetalhes_JatoParticular(){

        super.exibirDetalhes();
        System.out.println("Lotação: " + lotacao);
        System.out.println("Categoria: " + categoria);
        this.listarInstalacoes();
        System.out.println();

    }






}
