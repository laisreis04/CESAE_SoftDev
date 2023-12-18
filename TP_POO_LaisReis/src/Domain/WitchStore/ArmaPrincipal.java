package Domain.WitchStore;

public class ArmaPrincipal extends ItemHeroina {


    private int ataque;
    private int ataqueEspecial;

    public ArmaPrincipal(String nome, int precoItem, int ataque, int ataqueEspecial) {
        super(nome, precoItem);
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
    }

    //Colocar o método de ataque (String NPC)


}
