package Ex_02;

public class TacosFactory {

    public static Tacos criarTaco(String tipoTaco){

        tipoTaco = tipoTaco.toLowerCase();

        switch (tipoTaco){

            case "carne":
                return new Carne();
            case "frango":
                return new Frango();
            case "vegan":
                return new Vegan();

            default:
                throw new IllegalArgumentException("Tipo de taco não conhecido" + tipoTaco);
        }

    }
}
