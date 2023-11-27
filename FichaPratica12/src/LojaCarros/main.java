package LojaCarros;

import java.io.FileNotFoundException;

public class main {
    public static void main(String[] args)throws FileNotFoundException {

        Carro seat = new Carro("Seat", "Ibiza", 2010, 160,1200,TipoCombustivel.DIESEL,6.5,2);
        Carro fiat = new Carro("Punto", "Fiat", 2003,80,1000,TipoCombustivel.GASOLINA,5.5,5);
        Carro cupra = new Carro("Cupra", "Xl500", 2022, 180, 1400,TipoCombustivel.GASOLINA,7.5,5);
        Carro bmw = new Carro("BMW", "X6", 2023, 180,1600,TipoCombustivel.ELETRICO,2.5,5);

        Moto kawazaky = new Moto("Kawazaky", "ninja", 2005,300,2500,TipoCombustivel.GASOLINA,10.5);

        Caminhao toyota = new Caminhao("Toyota", "Belford", 1989, 120,1500,TipoCombustivel.DIESEL,12.5,500);


        System.out.println("Vencedor da Corrida ");
        seat.corrida(kawazaky);
        System.out.println();

        System.out.println("Proço de uma viagem Porto - Viseu: ");
        fiat.consumo(150);

        toyota.calcularPeso(150,400);

    }
}
