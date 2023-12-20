package Repository;

import Domain.Itens.ItemHeroina;
import Tools.CSVReaderWitchStore;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class WitchStoreRepository {

    //Colocar aqui o "shortcut" para o ficheiro, é uma base de dados, toda vez que a a
    //loja é acessada ela vem buscar daqui o ser repertótio


    //Instaciar o CVSReader aqui dentro, para pode usar o ficheiro depois


    private ArrayList<ItemHeroina> itensLista;


    /**
     * Método para ler o ficheiro CSV
     * @param path - Recebe o caminho para o ficheiro como parametro
     */
    public WitchStoreRepository(String path) throws FileNotFoundException {

        CSVReaderWitchStore csvReader = new CSVReaderWitchStore(path);
        this.itensLista = csvReader.readCSVtoRepository();
    }

    public ArrayList<ItemHeroina> getItensLista() {
        return itensLista;
    }



}
