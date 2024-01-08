package Ex_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    //Chamar classe

    Animal animal1;
    Animal animal2;
    Animal animal3;
    Animal animal4;


    //Fazer o beforeEach

    @BeforeEach
    void setUp(){

//        animal = new Animal("Bluff", Alimento.VEGETAIS);
        animal1 = new Animal("1717", Alimento.VEGETAIS);
        animal2 = new Animal("lolo" , Alimento.PEIXE);
        animal3 = new Animal("Bluff" , Alimento.FRUTAS);
        animal4 = new Animal("** fofo",Alimento.CARNE );


    }

    @Test
    void getNomeTest (){

//        assertEquals("Bluff", animal.getNome());
        assertEquals("1717", animal1.getNome());
        assertEquals("lolo", animal2.getNome());

        assertEquals("lala", animal2.getNome());
    }

    @Test
   void estarComFomeTest(){

        assertTrue(animal1.estaComFome());
       assertFalse(animal2.estaComFome());

    }

    @Test
    void getTipoAlimentacaoTest(){

        assertEquals(Alimento.VEGETAIS, animal1.getTipoAlimentacao());
        assertEquals(Alimento.CARNE, animal4.getTipoAlimentacao());
        assertEquals(Alimento.PEIXE, animal2.getTipoAlimentacao());
        assertEquals(Alimento.FRUTAS, animal3.getTipoAlimentacao());



        assertEquals(Alimento.PEIXE, animal1.getTipoAlimentacao());
    }


    @Test
    void comerTest() {


       //Animal come o que quer
      assertTrue(animal1.estaComFome());
      assertTrue(animal2.estaComFome());

      //Animal não come (não gosta)
      animal1.comer(Alimento.PEIXE);

      //Animal deixa de ter fome
      assertFalse(animal1.estaComFome());

      //Animal continua com fome
        assertTrue(animal1.estaComFome());

        //Animal come
        animal1.comer(Alimento.FRUTAS);

        //Já comeu e não tem mais fome
        assertFalse(animal1.estaComFome());

        //retornar um alimento que ele coma

        animal1.comer(Alimento.VEGETAIS);
        assertTrue(animal1.estaComFome());






    }
}
