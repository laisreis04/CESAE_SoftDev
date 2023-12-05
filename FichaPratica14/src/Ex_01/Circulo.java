package Ex_01;

public class Circulo extends FiguraGeometrica{

    private double raio;

    private double base;
    private double altura;

    public Circulo(String cor, double raio, double base, double altura) {
        super(cor);
        this.raio = raio;
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double area() {
        return 3.14 *raio *raio;
    }

    @Override
    public double perimetro() {
        return 0;
    }
}
