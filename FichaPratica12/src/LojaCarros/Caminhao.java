package LojaCarros;

public class Caminhao extends Veiculo {

    private double capacidadeCargaKg;

    public Caminhao(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100Km, double capacidadeCargaKg) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, litros100Km);
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    public double calcularPeso(double distancia, double cargaKg){

        if(cargaKg < capacidadeCargaKg){
            double cargaTotal = cargaKg*1000;
            if (cargaTotal % 1000 == 0){
                double consumoTotal_Caminhao = consumo(distancia) * 1.1;
                System.out.println("Valor total da viagem: " + consumoTotal_Caminhao);
            }

        }else {
            System.out.println("Ultrapassou a carga máxima permitida, viagem recusada");
        }
        return cargaKg;
    }

}
