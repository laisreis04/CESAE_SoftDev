package Domain;

import Domain.Itens.ItemHeroina;
import Repository.WitchStoreRepository;
import Tools.TXTReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class Store {

    private ArrayList<ItemHeroina> itemHeroinas;

    public Store(ArrayList<ItemHeroina> itemHeroinas) {
        this.itemHeroinas = new ArrayList<>();
    }

    //    public Store() throws FileNotFoundException {
//        WitchStoreRepository repository = new WitchStoreRepository("src/Files/ItensHeroiRPG.csv");
//        this.itemHeroinas = repository.getItensLista();
//    }


//    /**
//     * Método para Imprimir os detalhes dos itens da Loja
//     * @throws FileNotFoundException
//     */
//    public void exibirDetalhesStore() throws FileNotFoundException{
//
//        TXTReader.imprimirFicheiro("src/Files/WitchStore_logo");
//        System.out.println();
//
//
//        //Criar uma Array com index aleatórios
//        ArrayList<Integer> arrayIndexAletorio = new ArrayList<>();
//
//        //Para criar os números aleatórios para cada array
//        Random random = new Random();
//
//
//        while (arrayIndexAletorio.size() < 10){
//            int indexAleatorio = random.nextInt(0, this.itemHeroinas.size());
//
//               if(!arrayIndexAletorio.contains(indexAleatorio)){
//                   arrayIndexAletorio.add(indexAleatorio);
//               }
//                }
//        //Para impirmir o Item que estar "guardado" no index aleatorio
//        int contador = 1;
//        for (int index: arrayIndexAletorio){
//            if(index < itemHeroinas.size()){
//                ItemHeroina itemAtual = itemHeroinas.get(index);
//                System.out.println("************* ITEM " + contador + " *************");
//                itemAtual.exibirDetalhes();
//                System.out.println("****************************************\n");
//                contador++;
//            }
//        }
//
//    }


}
