package View;

import Domain.Heroina.Heroinas;
import Domain.Heroina.NPC;

import java.io.IOException;



public class Sala_B2 {

    private Heroinas heroinaEscolhida;

    public Sala_B2() {
        this.heroinaEscolhida = heroinaEscolhida;
    }

    public void ataqueAoCavaleiroMentiroso() throws IOException, InterruptedException{


    System.out.println("* ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►** ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►** ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ► ◄ ◊ ►*\n");
    System.out.println();

    System.out.println("Sem dar tempo para explicações, a heroína ataca o cavaleiro, surpreendendo-o com sua reação imprevisível.\n" +
            "breve luta se inicia entre eles, com a heroína canalizando sua frustração e indignação no confronto direto.\n" +
            "A batalha interna e externa causa uma queda nos pontos de força e vitalidade de ambos, deixando um rastro de danos e confusão.\n" +
            "Uma sensação de desapontamento paira sobre o ambiente, ressaltando a complexidade das emoções humanas diante de situações inesperadas.\n" +
            " \n" +
            "Ambas as opções refletem diferentes desdobramentos da história, trazendo à tona as consequências das escolhas e emoções intensas \n" +
            "vividas pelos personagens.\"");


    NPC inimigo = new NPC("Cavaleiro Mentiroso", 150, 50, 120, 80);

      heroinaEscolhida.ataqueNPC(inimigo);

    System.out.println("Você ganhou essa batalha! Parabéns");

    Thread.sleep(1000);
    System.out.println("2...");
    Thread.sleep(1000);
    System.out.println("3...");
    Thread.sleep(1000);
    System.out.println("4...");
    Thread.sleep(1000);
    System.out.println("5...");
    Thread.sleep(1000);
    System.out.println("6...");
    Thread.sleep(1000);
    System.out.println("7...");
    Thread.sleep(1000);
    System.out.println("8...");
    Thread.sleep(1000);
    System.out.println("9...");
    Thread.sleep(1000);
    System.out.println("10...");

    Sala_FInal.salaFinal();


}


    }





