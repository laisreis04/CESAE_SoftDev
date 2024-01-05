package Ex_03;

import org.junit.jupiter.api.BeforeEach;

public class AnimalTest {

    //Chamar classe

    Animal animal;

    //Fazer o beforeEach

    @BeforeEach
    public void setUp(){

        //Duvida preciso criar um construtor aqui , como ue passo esse test?
        animal = new Animal();

    }


}
