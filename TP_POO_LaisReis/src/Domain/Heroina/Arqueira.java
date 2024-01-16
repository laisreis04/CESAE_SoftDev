package Domain.Heroina;

import Tools.TXTReader;
import View.Sala_FInal;

import java.io.IOException;

public class Arqueira extends Heroinas{

    public Arqueira(String nome, int vidaMax, int vidaAtual, int forca, int nivel, int moedas) {
        super(nome, vidaMax, vidaAtual, forca, nivel, moedas);
    }


    @Override
    public String ataqueNPC(NPC inimigo) throws IOException, InterruptedException {


        String ganhador = null;
        int ataqueEspecial;

        while (this.getVidaAtual() != 0 || inimigo.getVidaAtual() != 0){
            if(this.getVidaAtual() >= inimigo.getVidaAtual()){
                System.out.println("Bom ataque!");
                inimigo.setVidaAtual(inimigo.getVidaAtual() - this.getForca());
            }
            if (this.getVidaAtual() <= inimigo.getVidaAtual()){
                System.out.println("Oh NO! Sua falta de ataenção causou mais 10% de força no  contra ataque do " + inimigo.getNome() + "!");
                this.setVidaAtual(this.getVidaAtual() - inimigo.getForca());
            }
            if ( inimigo.getVidaAtual() == 0){
                ganhador = this.getNome();
                System.out.println("Você ganhou a batalha ");
                this.setMoedas(this.getMoedas() +inimigo.getMoedas());
                System.out.println("E ainda ficou com as moedas dele ( " + inimigo.getMoedas() + " )");
                System.out.println("Total: " + (this.getMoedas() + inimigo.getMoedas()));
                Sala_FInal.salaFinal();

            }
            if (this.getVidaAtual() == 0){
                System.out.println("Na vida não ganhamos todas as batalhas...");
                ganhador = inimigo.getNome();
                TXTReader.imprimirFicheiro("src/Files/GameOver");
                Sala_FInal.salaFinal();
            }

        }

        return ganhador;
    }



}
