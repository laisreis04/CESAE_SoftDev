package Controllers;


import Domain.Heroina.Entidade;
import Domain.Heroina.Heroinas;
import Domain.Itens.ArmaPrincipal;
import Domain.Itens.Consumiveis;
import Domain.Itens.ItemHeroina;

import Repository.WitchStoreRepository;
import Tools.TXTReader;
import View.Menu_Comeco_Missao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StoreController {

    private ArrayList<ItemHeroina> itemHeroinas;

    private Heroinas heroinaJogando;


    public StoreController(Heroinas jogadora) throws FileNotFoundException {
        WitchStoreRepository repository = new WitchStoreRepository("src/Files/ItensHeroiRPG.csv");
        this.itemHeroinas = repository.getItensLista();
    }

    /**
     * Método para Imprimir os detalhes dos itens da Loja
     *
     * @throws FileNotFoundException
     */
    public void exibirDetalhesStore() throws IOException, InterruptedException {

        TXTReader.imprimirFicheiro("src/Files/WitchStore_logo");
        System.out.println();


        //Criar uma Array com index aleatórios
        ArrayList<Integer> arrayIndexAletorio = new ArrayList<>();

        //Para criar os números aleatórios para cada array
        Random random = new Random();

        int contador = 1;


        while (arrayIndexAletorio.size() < 10) {
            int indexAleatorio = random.nextInt(this.itemHeroinas.size());
            if (!arrayIndexAletorio.contains(indexAleatorio)) {
                arrayIndexAletorio.add(indexAleatorio);
            }

            //Para impirmir o Item que estar "guardado" no index aleatorio

        }
        ItemHeroina itemAtual = itemHeroinas.get(contador);
        if (itemAtual != null) {
            System.out.println("************* ITEM " + contador + " *************");
            itemAtual.exibirDetalhes();
            System.out.println("****************************************\n");
            contador++;

            //Verificações para saber se aqueloa Heroína pode ou não comprar aquele item, e depois guardar ele no invetário dela.

            Scanner input = new Scanner(System.in);

            System.out.println("Toda luta é necessário uma ajuda, o que você vai querer comprar? ");
            int itemCompra = input.nextInt();
            System.out.println("Nossa developer, tentou, tentou, tentou, mas no final não conseguiu mostrar a lojinha da bruxa.");
            System.out.println("Mas a sua viagem não para aqui, carrega o numero 1 para continuar.");


            //Verificar se o input está dentro do itens apresentados (se inseriu um numero que corresponde ao que foram apresentados)

            if (itemCompra >= 1 && itemCompra <= arrayIndexAletorio.size()) {
                //Colocar o menos -1 pq todos os array começam com 0 e a minha lista começa no 1.
                itemCompra = arrayIndexAletorio.get(itemCompra - 1);
                if (itemCompra < itemHeroinas.size()) {
                    //Armazenar numa variavel, para depois fazer as comprações (if's)
                    ItemHeroina item_Escolhido_USer = itemHeroinas.get(itemCompra);//estava o contador aqui

                    // if pode usar e comprar
//                    if (itemCompra == contador) {
//
//                        int precoItem = itemHeroinas.getFirst().getPrecoItem();
//                        int moedasIniciais = heroinaJogando.getMoedas();
//
//
//                        if (moedasIniciais >= precoItem) {
//                            // TODO: validar se é consumivel
//                            heroinaJogando.adicionar_Invetario((Consumiveis) item_Escolhido_USer);
//                            System.out.println("Item Adicionado com sucesso!");
//                            int moedaDepoisCOmpra = moedasIniciais - precoItem;
//                            heroinaJogando.setMoedas(moedaDepoisCOmpra);
//
//                            if (item_Escolhido_USer instanceof ArmaPrincipal) {
//                                substituir_Armaprincipal((ArmaPrincipal) item_Escolhido_USer, heroinaJogando);
//                                int moedaDepois = moedasIniciais - precoItem;
//                                heroinaJogando.setMoedas(moedaDepois);
//                            }
//                        } else {
//                            System.out.println("Diñero insuficiente");
//
//                        }


                    }

                }


            }
        Menu_Comeco_Missao menuMissao = new Menu_Comeco_Missao();
        menuMissao.primeiraMissao();

        }




        /**
         * Método para condicionar os tipos de itens que cada herína pode usar
         * @param heroina
         * @param itemHeroinaCompra
         * @return
         */
    public boolean heroinaPodeUsar(Heroinas heroina, ItemHeroina itemHeroinaCompra){
        if (heroina != null) {
            String classeHeroina = heroina.getClass().getSimpleName();

            for(String heroinaPermitidaAtual: itemHeroinaCompra.getHeroinaPertitida()){
                if(classeHeroina.equals(heroinaPermitidaAtual)){
                    return true;
                }

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
        public boolean substituir_Armaprincipal (ArmaPrincipal novaArma, Heroinas heroinaJogando){
            // Verificar se a arma pode ou não ser selecionada (na lista de heroinas permitidas)
            if (novaArma != null) {

                return true;
            }

            return false;
        }

    }


