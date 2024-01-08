package Ex_05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    Funcionario fun1;

    Funcionario fun2;

    @BeforeEach
    void setUp() {

        fun1 = new Funcionario("Banana", 2000,"IT");
        fun2 = new Funcionario("Antonio Costa", 5000,"Primeiro ministro");
    }

    @Test
    void aumentarSalarioTest() {

        //Fun1 antes
        assertEquals(2000,fun1.getSalario());
        //Fun1 - depois
        fun1.aumentarSalario(10);

        assertEquals(2200,fun1.getSalario());


        //Fun2 antes
        assertEquals(5000,fun2.getSalario());
        //Fun2 - depois
        fun2.aumentarSalario(500);

        assertEquals(30000,fun2.getSalario());


    }
}