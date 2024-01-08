package Ex_06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    Carro car1;
    Carro car2;

    @BeforeEach
    void setUp() {

        car1 = new Carro("Seat","Arona", 2023,150,1200,TipoCombustivel.DIESEL,5.5);
        car2 = new Carro("Ford", "ka", 2005,100,1000,TipoCombustivel.DIESEL,8.5);
    }

    @Test
    void ligar() {



    }

    @Test
    void corrida() {

        assertEquals(car1, car1.corrida(car2));
    }

    @Test
    void consumo() {


        assertEquals(1.1, car1.consumo(20));

    }
}