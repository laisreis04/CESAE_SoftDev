package Domain.Heroina;

import Tools.TXTReader;
import View.Sala_FInal;

import java.io.IOException;

public class Cavaleira extends Heroinas {

    public Cavaleira(String nome, int vidaMax, int vidaAtual, int forca, int nivel, int moedas) {
        super(nome, vidaMax, vidaAtual, forca, nivel, moedas);
    }

    @Override
    public String toString() {
        return "Cavaleira{" +
                "inventario=" + inventario +
                '}';
    }

    public Cavaleira() {

    }



    @Override
    public void ataqueNPC(NPC inimigo) throws IOException, InterruptedException {

        String ganhador = null;

        while (this.getVidaAtual() != 0 || inimigo.getForca() != 0){
            if(this.getVidaAtual() >= inimigo.getForca()){
                System.out.println("Por essa você não esperava o " + inimigo.getNome() + "atacou primeiro!");
                this.setVidaAtual((int) (getForca() * 0.2));
            }
            if(this.getVidaAtual() <= inimigo.getVidaAtual()){
                System.out.println("Há sempre um contra ataque e a nossa Heroina " + this.getNome() + " fez um contra ataque espetacular");
                inimigo.setVidaAtual(inimigo.getVidaAtual() - this.getForca());
            }
            if (this.getVidaAtual() == 0){
                System.out.println("Não foi dessa vez...");
                ganhador = inimigo.getNome();
                TXTReader.imprimirFicheiro("src/Files/GameOver");
                Sala_FInal.salaFinal();
            }
            if(inimigo.getVidaAtual() == 0){
                ganhador = this.getNome();
                System.out.println("Você ganhou a batalha ");
                this.setMoedas(this.getMoedas() +inimigo.getMoedas());
                System.out.println("E ainda ficou com as moedas dele ( " + inimigo.getMoedas() + " )");
                System.out.println("Total: " + (this.getMoedas() + inimigo.getMoedas()));
                Sala_FInal.salaFinal();
            }

        }


    }
}
