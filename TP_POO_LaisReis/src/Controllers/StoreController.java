package Controllers;


import Domain.Heroina.Heroinas;
import Domain.Itens.ItemHeroina;

import Repository.WitchStoreRepository;
import Tools.TXTReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StoreController {

    private ArrayList<ItemHeroina> itemHeroinas;
    private Domain.Itens.Consumiveis Consumiveis;

    public StoreController() throws FileNotFoundException {
        WitchStoreRepository repository = new WitchStoreRepository("src/Files/ItensHeroiRPG.csv");
        this.itemHeroinas = repository.getItensLista();
    }

    /**
     * Método para Imprimir os detalhes dos itens da Loja
     * @throws FileNotFoundException
     */
    public void exibirDetalhesStore(Heroinas heroina) throws FileNotFoundException{

        TXTReader.imprimirFicheiro("src/Files/WitchStore_logo");
        System.out.println();


        //Criar uma Array com index aleatórios
        ArrayList<Integer> arrayIndexAletorio = new ArrayList<>();

        //Para criar os números aleatórios para cada array
        Random random = new Random();


        while (arrayIndexAletorio.size() < 10){
            int indexAleatorio = random.nextInt(0, this.itemHeroinas.size());

            if(!arrayIndexAletorio.contains(indexAleatorio)){
                arrayIndexAletorio.add(indexAleatorio);
            }
        }
        //Para impirmir o Item que estar "guardado" no index aleatorio
        int contador = 1;
        for (int index: arrayIndexAletorio){
            if(index < itemHeroinas.size()){
                ItemHeroina itemAtual = itemHeroinas.get(index);
                System.out.println("************* ITEM " + contador + " *************");
                itemAtual.exibirDetalhes();
                System.out.println("****************************************\n");
                contador++;
            }
        }

        //Colocar aqui o adicionar item?
        System.out.println("Qual quer comprar? ");
int itemCompra = input.nextInt();

// if pode usar

        // if arma principal

        // if consumivel
        heroina.adiconar_Invetario(this.itemHeroinas.get(arrayIndexAletorio.get(itemCompra)));

    }

public boolean heroinaPodeUsar(Heroinas heroina, ItemHeroina itemHeroinaCompra){
        for(String heroinaPermitidaAtual: itemHeroinaCompra.getHeroinaPertitida()){
            if(heroina.getClass().getSimpleName().equals(heroinaPermitidaAtual)){
                return true;
            }

        }
        return false;
}



public void adicionarItem(int itemComprado) throws FileNotFoundException {

    Scanner input= new Scanner(System.in);
    itemComprado = input.nextInt();


}

  public void venderItensLoja(Heroinas tipoHeroina){

        int moedasIniciais = tipoHeroina.getMoedas();

        //Check para verificar se pode ou não comprar o item
      ItemHeroina itemHeroina = itemHeroinas.get(//Esse index é o da loja);
      if(heroinaPodeUsar(tipoHeroina, ){

      }

  }


}
