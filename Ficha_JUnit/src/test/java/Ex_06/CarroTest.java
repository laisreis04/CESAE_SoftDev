package Ex_06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Ex_06.TipoCombustivel.DIESEL;
import static Ex_06.TipoCombustivel.GASOLINA;
import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    Carro car1;
    Carro car2;

    @BeforeEach
    void setUp() {

        car1 = new Carro("Seat", "Arona", 2022,200,1200,DIESEL,6.5);
        car2 = new Carro("Ford", "Ka", 2005,150,900,GASOLINA,8.5);
    }

    @Test
    void getPotencia() {
    }

    @Test
    void ligar() {


        assertEquals(car1.getPotencia());



    }

    @Test
    void corrida() {
    }

    @Test
    void consumo() {


        assertEquals(1.3,car1.consumo(20));

    }
}