package Controllers;


import Domain.Venda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class ClientControllerTest {


    ClientController cliente;
    ClientController cliente2;

    @BeforeEach
    void setUp() throws FileNotFoundException {

        cliente = new ClientController("src/test/resources/minimercadoTest.csv");
        cliente2 = new ClientController("src/test/resources/minimercadoTest2.csv");
    }

    @Test
    void produtoMaisCaroTest() {

    assertEquals(40000.99, cliente.produtoMaisCaro().getPrecoUnitario());
    assertEquals("LGTV OLED 85 Golden Edition", cliente.produtoMaisCaro().getProduto());
    }

    @Test
    void produtosDisponiveisSemDuplicadosTest() {

        //Esse método realiza funções em ArraysList, por isso testar apenas o que é esperado de um ArrayList

        //Para saber o tamanho do ArrayList
        assertEquals(5, cliente2.produtosDisponiveisSemDuplicados().size());

        //Testar para ver os atributos
        assertEquals("Aldi", cliente2.produtosDisponiveisSemDuplicados().get(1).getProduto());

    }

    @Test
    void produtosDeCategoriaTest() {

        assertEquals(0,cliente2.produtosDeCategoria("produto").size());

        //no get(index), vai buscar o index do novo arrayList que foi criado com o filtro
        assertEquals("Saude", cliente2.produtosDeCategoria("Saude").get(1).getTipoProduto());
    }

    @Test
    void produtoMaisBaratoTest() {

        assertEquals("papel", cliente2.produtoMaisBarato().getProduto());
        assertEquals(0.2, cliente2.produtoMaisBarato().getPrecoUnitario());



    }
}