package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setCalculator(){
        calculator = calculator;
    }

    @Test
    public void addTest(){

        assertEquals(10,calculator.add(5,5));

    }

}