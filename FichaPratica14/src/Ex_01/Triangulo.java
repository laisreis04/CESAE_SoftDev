package Ex_01;

public class Triangulo extends FiguraGeometrica {



    private double altura;

    private double base;

    public Triangulo(String cor, double altura, double base) {
        super(cor);
        this.altura = altura;

        this.base = base;
    }

    @Override
    public double area() {
        return (base* altura) /2;
    }

    @Override
    public double perimetro() {
        return base *altura;
    }
}
