package Domain;

import Controllers.Points_DistributionController;
import Controllers.StoreController;
import Domain.Itens.ItemHeroina;
import Repository.WitchStoreRepository;
import Tools.TXTReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class Store {

    private ArrayList<ItemHeroina> itemHeroinas;

    public Store(ArrayList<ItemHeroina> itemHeroinas) throws FileNotFoundException {
        WitchStoreRepository repository = new WitchStoreRepository("src/Files/ItensHeroiRPG.csv");
        this.itemHeroinas = repository.getItensLista();
    }



}
