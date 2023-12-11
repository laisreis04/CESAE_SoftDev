package Ex_02;

public class Carne extends Tacos{



    @Override
    public void prepare() {
        System.out.println("A preparar taco de carne...");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar taco de carne...");
    }

    @Override
    public void box() {
        System.out.println("A embalar taco de carne...");
    }
}
