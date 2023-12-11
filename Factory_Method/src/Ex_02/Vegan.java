package Ex_02;

public class Vegan extends Tacos{

    @Override
    public void prepare() {
        System.out.println("A preparar taco vegan...");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar taco vegan...");
    }

    @Override
    public void box() {
        System.out.println("A embalar taco vegan...");
    }
}
