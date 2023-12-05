package Ex_01;

public class Main {
    public static void main(String[] args) {


        Triangulo t1 = new Triangulo("Azul", 20,10);

        Circulo c1 = new Circulo("Verde", 25,15,10);

        Retangulo r1 = new Retangulo("Amarelo", 45,56);


        t1.mostrarCor();
        System.out.println("área: " + t1.area());
        System.out.println("perimetro: " + t1.perimetro());


    }
}
