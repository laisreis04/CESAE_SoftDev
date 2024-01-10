package Controllers;

import Domain.Venda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorControllerTest {


    AdministradorController admin;


    @BeforeEach
    void setUp() throws FileNotFoundException {
        admin = new AdministradorController("src/test/resources/minimercadoTest2.csv");

    }

    /**
     * Teste - Passou
     */
    @Test
    void produtoMaisVendidoTest() {

        assertEquals("cerveja", admin.produtoMaisVendido().getProduto());
        assertEquals("cerveja", admin.produtoMaisVendido().getProduto());


    }

    @Test
    void produtoQueMaisVendeuTest() {

        assertEquals("cerveja",admin.produtoQueMaisVendeu().getProduto());
        assertEquals("Bar", admin.produtoQueMaisVendeu().getTipoProduto());
    }

    @Test
    void vendaMaisValorTest() {

        assertEquals(1.5,admin.vendaMaisValor().getPrecoUnitario());
        assertEquals("cerveja", admin.vendaMaisValor().getProduto());

    }

    /**
     *Teste para verificar se o método de adicionar novos Utilizadores está a funcionar corretamente.
     *
     * @throws IOException
     */
    @Test
    void adicionarUtilizadorTest() throws IOException {

       String filePath = "src/test/resources/login_grandesNegociosTest2.csv";

        admin.adicionarUtilizador(filePath,"Admin","lala","1234");

        File file = new File(filePath);
        Scanner sc = new Scanner(file);

        String tipoUtilizador = null;
        String userName = null;
        String password = null;

        while(sc.hasNextLine()){

            String linha = sc.nextLine();
            String[] linhaSeparada = linha.split(";");

            tipoUtilizador = linhaSeparada[0];
            userName = linhaSeparada[1];
            password = linhaSeparada[2];
        }

        assertEquals("Admin",tipoUtilizador);
        assertEquals("lala", userName);
        assertEquals("1234", password);



    }

    /**
     * Teste de Exceptions - FAIL - Não devolve a mensagem de Exception
     * @throws IOException
     */
    @Test
    void adicionarUtilizadorInavalidTest() throws IOException {

        String filePath = "src/test/resources/login_grandesNegociosTest2.csv";

        assertThrows (IllegalArgumentException.class, () -> {
            admin.adicionarUtilizador(filePath,"Funcionario Fantasma", "Ghost", "1234");

        });


    }

    @Test
    void valorVendasTest() throws FileNotFoundException {


        assertEquals(751.2,admin.valorVendas());




    }

    @Test
    void mediaVendasTest() {

    assertEquals(93.9,admin.mediaVendas());



    }
}