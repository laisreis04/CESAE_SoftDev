package Domain.Heroina;

import Domain.Itens.Pocao;
import Tools.TXTReader;
import View.Sala_FInal;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Feiticeira extends Heroinas {

    public Feiticeira(String nome, int vidaMax, int vidaAtual, int forca, int nivel, int moedas) {
        super(nome, vidaMax, vidaAtual, forca, nivel, moedas);
    }



    public Feiticeira() {

    }

    @Override
    public void ataqueNPC(NPC inimigo) throws IOException, InterruptedException {

        String ganhador = null;

        while(this.getVidaAtual() != 0 || inimigo.getVidaAtual() != 0){
            System.out.println("A Feiticeira " + this.getNome() + " ataca " + inimigo.getNome());
            inimigo.setVidaAtual(inimigo.getVidaAtual() - this.getForca());

            if(this.getVidaAtual() >= inimigo.getVidaAtual()){
                System.out.println(inimigo.getNome() + "faz um contra golpe");
                this.setVidaAtual(this.getVidaAtual() - inimigo.getForca());
            }
            if(inimigo.getVidaAtual() == 0){
                ganhador = this.getNome();
                this.setMoedas(this.getMoedas() +inimigo.getMoedas());
                System.out.println("Você venceu a batalha!");
                System.out.println("E ainda ficou com as moedas dele ( " + inimigo.getMoedas() + " )");
                System.out.println("Total: " + (this.getMoedas() + inimigo.getMoedas()));
                Sala_FInal.salaFinal();


            }
            if (this.getVidaAtual() == 0){
                System.out.println("Você perdeu a batalha!");
                ganhador = inimigo.getNome();
                TXTReader.imprimirFicheiro("src/Files/GameOver");
                Sala_FInal.salaFinal();
            }
        }

    }
}





