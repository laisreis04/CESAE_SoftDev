package Domain.Itens;

public class ConsumivelCombate extends Consumiveis {

    private int ataqueInstantaneo;

    public ConsumivelCombate(String nome,int precoItem, int ataqueInstantaneo) {
        super(nome, precoItem);
        this.ataqueInstantaneo = ataqueInstantaneo;
    }


    //exibir detalhes combate ();

}
