import Controllers.StoreController;
import Domain.Heroina.Cavaleira;
import Domain.Heroina.Heroinas;
import Domain.Itens.ArmaPrincipal;
import Domain.Store;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainTeste_ImprimirItensLojas {
    public static void main(String[] args) throws IOException, InterruptedException {




        //Heroinas heroina = new Cavaleira("Lais",100,100,20,5,2);

        StoreController lojinha = new StoreController();

        lojinha.exibirDetalhesStore();




    }
}