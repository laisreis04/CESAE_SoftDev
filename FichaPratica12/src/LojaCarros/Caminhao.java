package LojaCarros;

public class Caminhao extends Veiculo {

    private double capacidadeCargaKg;
    private String capacidadeCarga;

    public Caminhao(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100Km, double capacidadeCargaKg) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, litros100Km);
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    public double calcularPeso(double distancia, double cargaKg){

        if (cargaKg > this.capacidadeCarga) { // Muito pesado
            System.out.println("Carga: "+cargaKg+"Kg. muito pesada. Capacidade Máxima: "+this.capacidadeCarga+"Kg.");
            return false;
        } else { // Tem capacidade para a viagem
            double litrosConsumidos = calcularConsumo(distancia);
            double litrosExtra = cargaKg / 1000;
            litrosConsumidos += litrosExtra;

            double valorViagem = litrosConsumidos * TipoCombustivel.DIESEL;

            System.out.println("Consumo: "+litrosConsumidos+"L");
            System.out.println("Valor: "+valorViagem+"€");

            return true;
        }

}


