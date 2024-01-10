package Controllers;

import Domain.Venda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioControllerTest {

    FuncionarioController funcionario;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        funcionario = new FuncionarioController("src/test/resources/minimercadoTest2.csv");
    }

    @Test
    void addVendasTest() throws IOException {
        
        funcionario.addVenda("Bar", "Vodka", 150,15.90, "src/test/resources/minimercadoTest2.csv");

        Scanner sc = new Scanner(new File("src/test/resources/minimercadoTest2.csv"));
        
        String lerLinha = sc.nextLine();

        String[] divisaoLinhas = new String[0];
        
        while(sc.hasNextLine()){

            lerLinha = sc.nextLine();
           divisaoLinhas = lerLinha.split(",");
            
        }
        
        
        
        assertEquals("Vodka", divisaoLinhas[1]);
        assertEquals("Bar", divisaoLinhas[0]);
        assertEquals(150, divisaoLinhas[2]);

    }

    @Test
    void consultarStockProdutoTest() {

        assertEquals(-49, funcionario.consultarStockProduto("copo"));

    }
}