package Ex_04;


import java.util.Scanner;

public class Retangulo {

    private double largura;
    private double altura;


    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea(){

        return this.largura*this.altura;
    }

    public double calcularPerimetro(){
        return (this.largura*2) + (this.altura*2);
    }

}
