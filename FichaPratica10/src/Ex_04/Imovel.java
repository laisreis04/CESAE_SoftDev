package Ex_04;

public class Imovel {

    private String rua;
    private int numPorta;
    private String cidade;
    private TipoMoradia tipoMoradia;
    private Acabamento acabamento;
    private double area;
    private int numQuartos;
    private int numBanheiros;
    private double areaPiscina;


    public Imovel(String rua, int numPorta, String cidade, TipoMoradia tipoMoradia, Acabamento acabamento, double area,
            int numQuartos, int numBanheiros, double areaPiscina) {
        this.rua = rua;
        this.numPorta = numPorta;
        this.cidade = cidade;
        this.tipoMoradia = tipoMoradia;
        this.acabamento = acabamento;
        this.area = area;
        this.numQuartos = numQuartos;
        this.numBanheiros = numBanheiros;
        this.areaPiscina = areaPiscina;
    }


    /**
     * Metodo para Calcular o valore de cada imovel
     * @param moradia
     * @param areaMoradia inicia com 1m quadrado
     * @param estado
     * @param quartos
     * @param banheiros
     * @param tamanhoPiscina
     */
    public void valorImovel(){

    

        //Valores por Moradia, posso colocar no enum de cada um, com o respsctivo valor.
        // Guardar o preço numa variavel
        double precoApartamento = TipoMoradia.APARTAMENTO.calcularValorMoradia(areaTotalMoradia);
        double precoCasa = TipoMoradia.CASA.calcularValorMoradia(areaTotalMoradia);
        double precoMansao = TipoMoradia.MANSÃO.calcularValorMoradia(areaTotalMoradia);

        //cada estado diferente corresponde a um valor que será retirado ou acrescentado:

        //Restauro
        double preçoRestauroApe = Acabamento.RESTAURO.calcularValorAcabamento(precoApartamento);
        double preçoRestauroCasa = Acabamento.RESTAURO.calcularValorAcabamento(precoCasa);
        double preçoRestauroMansao = Acabamento.RESTAURO.calcularValorAcabamento(precoMansao);

        //Usada
        double preçoUsadaApe = Acabamento.RESTAURO.calcularValorAcabamento(precoApartamento);
        double preçoUsadaCasa = Acabamento.RESTAURO.calcularValorAcabamento(precoCasa);
        double preçoUsadaMansao = Acabamento.RESTAURO.calcularValorAcabamento(precoMansao);

        //Nova com acabamento
        double preçoNovaAcabApe = Acabamento.RESTAURO.calcularValorAcabamento(precoApartamento);
        double preçoNovaAcabCasa = Acabamento.RESTAURO.calcularValorAcabamento(precoCasa);
        double preçoNovaAcabMansao = Acabamento.RESTAURO.calcularValorAcabamento(precoMansao);

        quartos += 7500;
        banheiros += 10500;
        tamanhoPiscina += 1000;

        System.out.println("valor do imovel: " + areaTotalMoradia + estado + quartos + banheiros + tamanhoPiscina);
        

    }

    


   



    
    
}
