import Controllers.StoreController;
import Domain.Heroina.Cavaleira;
import Domain.Heroina.Heroinas;
import Domain.Store;

import java.io.FileNotFoundException;

public class MainTeste_ImprimirItensLojas {
    public static void main(String[] args) throws FileNotFoundException {

//        StoreController lojinha1 = new StoreController();
//        lojinha1.exibirDetalhesStore();

        Heroinas heroina = new Cavaleira("Lais",100,100,20,5,2,null);

        StoreController lojinha = new StoreController();




        System.out.println(heroina.getClass().getSimpleName());

    }
}