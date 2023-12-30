package Domain;

import Domain.Itens.ItemHeroina;
import Repository.WitchStoreRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Store {

    private ArrayList<ItemHeroina> itemHeroinas;

    public Store(ArrayList<ItemHeroina> itemHeroinas) throws FileNotFoundException {
        WitchStoreRepository repository = new WitchStoreRepository("src/Files/ItensHeroiRPG.csv");
        this.itemHeroinas = repository.getItensLista();
    }



}
