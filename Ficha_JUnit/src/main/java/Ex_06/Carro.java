package Ex_06;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private int potencia;
    private int cilindrada;
    private TipoCombustivel tipoCombustivel;
    private double litrosKm;

    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litrosKm) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.litrosKm = litrosKm;
    }

    public void exibirDetalhes(){

        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Tipo de combustivel: " + this.tipoCombustivel);

    }


    public int getAno() {
        return ano;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public double getLitrosKm() {
        return litrosKm;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    /**
     * Metodo quando liga o carro
     */
    public void ligar(){

        int idade = 2023 - this.ano;

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
        }
    }

    public Carro corrida(Carro adversario){

        if(this.potencia > adversario.potencia){
            return this;
        }else if(this.cilindrada < adversario.cilindrada){
            return adversario;
        }else if (this.ano > adversario.ano){
            return adversario;
        }
        return null;

    }

    public double consumo(double kmPercorridos){


        double calConsumo =  (this.litrosKm * kmPercorridos)/100;
        System.out.println("Consumo: " + calConsumo + " litros");
        return calConsumo;
    }

}
