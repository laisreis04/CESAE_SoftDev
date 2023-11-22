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
     * Método para calcular o  <b>valor do imóvel<b/>
     */
    public void valorImovel(){

       if(tipoMoradia.equals(TipoMoradia.APARTAMENTO)){
           //restuaro + o valor do imovel
           // para calcular o valor do imovel = tipoMoradia.calcularValorMoradia(area)
           // para calcular o valor do acabamento = acabamento.calcularValorAcabamento

           double precoApe = acabamento.calcularValorAcabamento(tipoMoradia.calcularValorMoradia(area));
           double utilidades = (numQuartos *= 7500) + (numBanheiros *= 10500) + (areaPiscina *= 1000);
           System.out.println("Valor imovel: " + (precoApe + utilidades) + " Euros");
       }
       if (tipoMoradia.equals(TipoMoradia.CASA)){
           double precoApe = acabamento.calcularValorAcabamento(tipoMoradia.calcularValorMoradia(area));
           double utilidades = (numQuartos *= 7500) + (numBanheiros *= 10500) + (areaPiscina *= 1000);
           System.out.println("Valor imovel: " + (precoApe + utilidades) + " Euros");

       }
       if (tipoMoradia.equals(TipoMoradia.MANSÃO)){
           double precoApe = acabamento.calcularValorAcabamento(tipoMoradia.calcularValorMoradia(area));
           double utilidades = (numQuartos *= 7500) + (numBanheiros *= 10500) + (areaPiscina *= 1000);
           System.out.println("Valor imovel: " + (precoApe + utilidades) + " Euros" );
       }

    }

    /**
     * Método para imprimir os <b>dados do imovel<b/>
     */
    public void exibirdados(){


        System.out.println("Cidade: " + cidade);
        System.out.println("Tipo do imóvel: " + tipoMoradia);
        System.out.println("Morada: " + rua);
        System.out.println("******* DETALHES ********");
        System.out.println("Números de quartos: " + numQuartos);
        System.out.println("Números de banheiros: " + numBanheiros);
        System.out.println("Piscina: " + areaPiscina);

    }

    /**
     * Método para comparar qual o imóvel mais caro
     * @param imovelcomparado Parametro onde leva o imovel a ser comparado
     * @return <b>Retorna o imóvel mais caro<b/>
     */
    public Imovel compararImovel(Imovel imovelcomparado){

        //como eu faço essa comparação?

        if(imovelcomparado.valorImovel() > this.valorImovel()){

            System.out.println("Imóvel mais caro: " + imovelcomparado);
        }
        return imovelcomparado;

    }
    


   



    
    
}
