package Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class LoginControllerTest {

    LoginController login;

    AdministradorController admin;

    @BeforeEach
    void setUp() throws FileNotFoundException {

        login = new LoginController("src/test/resources/login_grandesNegociosTest2.csv");
        admin = new AdministradorController("src/test/resources/login_grandesNegociosTest2.csv");
    }


    @Test
    void validarLogin() throws IOException {

        admin.adicionarUtilizador("src/test/resources/login_grandesNegociosTest2.csv", "FUNC", "You Did it", "321!");
        

        Scanner sc = new Scanner(new File("src/test/resources/login_grandesNegociosTest2.csv"));

        String linha = sc.nextLine();

        String[]  divisaoLinhas = new String[0];

        while(sc.hasNextLine()){
            linha = sc.nextLine();

            divisaoLinhas = linha.split(";");

        }

        login.validarLogin("FUNC", "You Did it", "321!");

        assertEquals("You Did it", divisaoLinhas[1]);
        assertEquals("321!", divisaoLinhas[2]);

    }
}