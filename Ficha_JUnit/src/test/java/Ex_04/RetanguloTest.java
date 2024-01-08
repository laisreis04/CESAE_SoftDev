package Ex_04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

 Retangulo figura1;
 Retangulo figura2;

    @BeforeEach
    void setUp() {
        figura1 = new Retangulo(20,35);
        figura2 = new Retangulo(10.5,12.3);
    }

    @Test
    void calcularArea() {

        assertEquals(700, figura1.calcularArea());
        assertEquals(129.15,figura2.calcularArea());

    }

    @Test
    void calcularPerimetro() {

        assertEquals(150, figura1.calcularPerimetro());
        assertEquals(66.6, figura2.calcularPerimetro());

    }
}