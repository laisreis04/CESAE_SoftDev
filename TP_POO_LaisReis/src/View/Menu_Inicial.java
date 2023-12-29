package View;

import Domain.Jogo;
import Tools.TXTReader;

import java.io.IOException;
import java.util.Scanner;

public class Menu_Inicial {

    public Menu_Inicial(){

    }
    public static void MenuInicial() throws IOException {



        TXTReader.imprimirFicheiro("src/Files/Game_logo");

        Jogo jogar = new Jogo();
        jogar.criarPersonagem();





    }





}
