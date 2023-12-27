package Controllers;


import Domain.Heroina.Heroinas;
import Domain.Itens.ArmaPrincipal;
import Domain.Itens.Consumiveis;
import Domain.Itens.ItemHeroina;

import Repository.WitchStoreRepository;
import Tools.TXTReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StoreController {

    private ArrayList<ItemHeroina> itemHeroinas;
    private Consumiveis Consumiveis;

    private DifficultyController difuculdadeEscolhida;

    public StoreController() throws FileNotFoundException {
        WitchStoreRepository repository = new WitchStoreRepository("src/Files/ItensHeroiRPG.csv");
        this.itemHeroinas = repository.getItensLista();
    }

    /**
     * Método para Imprimir os detalhes dos itens da Loja
     * @throws FileNotFoundException
     */
    public void exibirDetalhesStore(Heroinas heroinaJogando) throws IOException {

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


        //Verificações para saber se aqueloa Heroína pode ou não comprar aquele item, e depois guardar ele no invetário dela.
        Scanner input= new Scanner(System.in);

        //Colocar aqui o adicionar item?
        System.out.println("Toda luta é necessário uma ajuda, o que você vai querer comprar? ");
        int itemCompra = input.nextInt();

        //Verificar se o input está dentro do itens apresentados (se inseriu um numero que corresponde ao que foram apresentados)

        if(itemCompra >=1 && itemCompra <= arrayIndexAletorio.size()){
            //Colocar o menos -1 pq todos os array começam com 0 e a minha lista começa no 1.
            int contadorItemescolhido = arrayIndexAletorio.get(itemCompra - 1 );
            if(contadorItemescolhido < itemHeroinas.size()){
                //Armazenar numa variavel, para depois fazer as comprações (if's)
                ItemHeroina item_Escolhido_USer = itemHeroinas.get(contadorItemescolhido);


                // if pode usar e comprar
                if (heroinaPodeUsar(heroinaJogando,item_Escolhido_USer)){
                    int precoItem = itemHeroinas.getFirst().getPrecoItem();
                    int moedasIniciais = difuculdadeEscolhida.parametros_Dificuldade();
                    if(moedasIniciais >= precoItem){
                        heroinaJogando.adiconar_Invetario((Consumiveis) item_Escolhido_USer);
                        System.out.println("Item Adicionado com sucesso!");
                        moedasIniciais -= precoItem;
                    }
                    ArmaPrincipal armaEscolhida_User = (ArmaPrincipal) itemHeroinas.get(contadorItemescolhido);
                    if(substituir_Armaprincipal(armaEscolhida_User,heroinaJogando)){
                        heroinaJogando.setArmas(armaEscolhida_User);
                        System.out.println("Arma Selecionada com Sucesso");
                        moedasIniciais -= precoItem;
                    }

                }
            }
       }
    }

    /**
     * Método para condicionar os tipos de itens que cada herína pode usar
     * @param heroina
     * @param itemHeroinaCompra
     * @return
     */
    public boolean heroinaPodeUsar(Heroinas heroina, ItemHeroina itemHeroinaCompra){
        for(String heroinaPermitidaAtual: itemHeroinaCompra.getHeroinaPertitida()){
            if(heroina.getClass().getSimpleName().equals(heroinaPermitidaAtual)){
                return true;
            }

        }
        return false;
}


    /**
     * Método para subustirui a arma principal por outra
     * @param novaArma
     * @param heroinaJogando
     * @return
     */
    public boolean substituir_Armaprincipal(ArmaPrincipal novaArma, Heroinas heroinaJogando){
        // Verificar se a arma pode ou não ser selecionada (na lista de heroinas permitidas)
        if(novaArma instanceof ArmaPrincipal){
            ArmaPrincipal armaEscolhida = heroinaJogando.getArmas();

            //Verificar se a arma é diferente e não é nula
            if (novaArma != null && !novaArma.equals(armaEscolhida)) {
            return true;
            }
        }


        return false;
    }



//public void adicionarItem(int itemComprado) throws FileNotFoundException {
//
//    Scanner input= new Scanner(System.in);
//    itemComprado = input.nextInt();
//
//
//}

//  public void venderItensLoja(Heroinas tipoHeroina){
//
//        int moedasIniciais = tipoHeroina.getMoedas();
//
//        //Check para verificar se pode ou não comprar o item
//      ItemHeroina itemHeroina = itemHeroinas.get(//Esse index é o da loja);
//      if(heroinaPodeUsar(tipoHeroina, ){
//
//      }
//
 }

