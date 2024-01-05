package Ex_01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void addTest(){

        assertEquals(10,calculator.add(5,5));

    }

    @Test
    public void subtractTest(){

       assertEquals(5, calculator.subtract(10,5));

    }
}