import Controllers.StoreController;

import java.io.FileNotFoundException;

public class MainTeste_ImprimirItensLojas {
    public static void main(String[] args) throws FileNotFoundException {

        StoreController lojinha1 = new StoreController();
        lojinha1.exibirDetalhesStore();

    }
}