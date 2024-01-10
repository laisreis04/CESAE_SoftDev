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

    AdministradorController adminNovoCvs;

    Venda venda1;
    Venda venda2;
    Venda venda3;



    @BeforeEach
    void setUp() throws FileNotFoundException {
        admin = new AdministradorController("src/test/resources/minimercadoTest.csv");


        //Adicionar novo item para calacular a soma no novo ficheiro
        venda1 = new Venda("Alimentacao", "Sushi", 50,5.99);
        venda2 = new Venda("Saude", "Aldi",120,1.0);
        venda3 = new Venda("Higiene", "copo", 45,9.99);



    }

    /**
     * Teste - Passou
     */
    @Test
    void produtoMaisVendidoTest() {

       assertEquals("Cerveja Super Bock",admin.produtoMaisVendido().getProduto());
       assertEquals("Alimentacao", admin.produtoMaisVendido().getTipoProduto());
    }

    @Test
    void produtoQueMaisVendeuTest() {

        assertEquals("Cerveja Super Bock",admin.produtoQueMaisVendeu().getProduto());
        assertEquals("Higiene", admin.produtoQueMaisVendeu().getTipoProduto());
    }

    @Test
    void vendaMaisValor() {

        assertEquals(300,admin.vendaMaisValor().getPrecoUnitario());
        assertEquals(40000.99, admin.vendaMaisValor().getPrecoUnitario());

    }

    /**
     *Teste para verificar se o método de adicionar novos Utilizadores está a funcionar corretamente.
     *
     * @throws IOException
     */
    @Test
    void adicionarUtilizador() throws IOException {

       String filePath = "src/test/resources/login_grandesNegociosTest.csv";

        admin.adicionarUtilizador(filePath,"Admin","lala","1234");

        File file = new File(filePath);
        Scanner sc = new Scanner(file);

        String tipoUtilizador;
        String userName;
        String password;

        while(sc.hasNextLine()){

            String linha = sc.nextLine();
            String[] linhaSeparada = linha.split(";");

            tipoUtilizador = linhaSeparada[0];
            userName = linhaSeparada[1];
            password = linhaSeparada[2];
        }

    }

    /**
     * Teste de Exceptions - FAIL - Não devolve a mensagem de Exception
     * @throws IOException
     */
    @Test
    void adicionarUtilizadorInavalidTest() throws IOException {

        String filePath = "src/test/resources/login_grandesNegociosTest.csv";

        assertThrows (IllegalArgumentException.class, () -> {
            admin.adicionarUtilizador(filePath,"Funcionario Fantasma", "Ghost", "1234");

        });


    }

    @Test
    void valorVendas() {

        //Criar um novo ficheiro
        // Adicionar os itens ao ficheiro
        admin.getTodasVendas().add(venda1);
        admin.getTodasVendas().add(venda2);
        admin.getTodasVendas().add(venda3);

        // testar metodo

        assertEquals(869.05,admin.valorVendas());


    }

    @Test
    void mediaVendas() {
    }
}