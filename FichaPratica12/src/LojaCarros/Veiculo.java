package LojaCarros;

public class Veiculo {

    private String marca;
    private String modelo;
     private int anoFabrico;

     private int potencia;
     private int cilindrada;
     private TipoCombustivel tipoCombustivel;

     private double litros100Km;

    public Veiculo(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100Km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.litros100Km = litros100Km;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getLitros100Km() {
        return litros100Km;
    }

    //ligar
    public void ligarVeiculo(){

        int idade = 2023 - this.anoFabrico;

        if(idade > 30){
            if(this.tipoCombustivel.equals(TipoCombustivel.DIESEL)){
                System.out.println("Deita um pouco de fumo...Custa a pegar...O carro está ligado!");
            }else {
                System.out.println("Custa a pegar... o carro está ligado!");
            }
        }


        if(idade < 30){
            if(this.potencia < 250){
                System.out.println("O carro está ligado!\nVrummmmmmmmmmmmmm");
            }else {
                System.out.println("O carro está ligado!\nVRUMMMMMMMMMMMMM");
            }
            if(this.tipoCombustivel.equals(TipoCombustivel.ELETRICO)){
                System.out.println("Carro ligado! \nHummmmmmmmmm");
            }
        }


    }


   //corrida
    public Veiculo corrida(Veiculo adversario){


        if(this.potencia > adversario.potencia){
            this.exibirDetalhes_Veiculo();
            return this;
        }else {
            if(potencia < adversario.potencia){
                adversario.exibirDetalhes_Veiculo();
                return adversario;
            }
        }if(this.cilindrada < adversario.cilindrada){
            adversario.exibirDetalhes_Veiculo();
            return adversario;
        }else {
            if(cilindrada > adversario.cilindrada){
                this.exibirDetalhes_Veiculo();
                return this;
            }
        }if (this.anoFabrico > adversario.anoFabrico){
            adversario.exibirDetalhes_Veiculo();
            return adversario;
        }else {
            if (anoFabrico < adversario.anoFabrico){
                this.exibirDetalhes_Veiculo();
                return this;
            }
        }
        return null;
    }


    //calcular consumo
    public double consumo(double kmPercorrido){

        if(tipoCombustivel.equals(TipoCombustivel.GASOLINA)){
            double consumoTotal = (this.litros100Km  * kmPercorrido)/100;
            double valor_Euros = tipoCombustivel.precoLitro_Combustivel(consumoTotal);
            System.out.println("Valor gasto é: " + valor_Euros + "€");
            return valor_Euros;
        } else if (tipoCombustivel.equals(TipoCombustivel.DIESEL)) {
            double consumoTotal = (this.litros100Km  * kmPercorrido)/100;
            double valor_Euros = tipoCombustivel.precoLitro_Combustivel(consumoTotal);
            System.out.println("Valor gasto é: " + valor_Euros + "€");
            return valor_Euros;
        } else if (tipoCombustivel.equals(TipoCombustivel.GLP)) {
            double consumoTotal = (this.litros100Km  * kmPercorrido)/100;
            double valor_Euros = tipoCombustivel.precoLitro_Combustivel(consumoTotal);
            System.out.println("Valor gasto é: " + valor_Euros + "€");
            return valor_Euros;
        } else if (tipoCombustivel.equals(TipoCombustivel.ELETRICO)) {
            double consumoTotal = (this.litros100Km  * kmPercorrido)/100;
            double valor_Euros = tipoCombustivel.precoLitro_Combustivel(consumoTotal);
            System.out.println("Valor gasto é: " + valor_Euros + "€");
            return valor_Euros;
        }


        return 0;
    }


    //exibirdetalhes
    public void exibirDetalhes_Veiculo(){

        System.out.println("********** VEICULO *********");
        System.out.println("Marca: " +marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabrico: " + anoFabrico);
        System.out.println("Potencia: " + potencia);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Tipode de Combustivel: " + tipoCombustivel);
        System.out.println("Litros100/Km: " + litros100Km);

    }

}
