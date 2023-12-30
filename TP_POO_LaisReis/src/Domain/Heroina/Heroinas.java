package Domain.Heroina;

import Domain.Itens.ArmaPrincipal;
import Domain.Itens.Consumiveis;
import Domain.Itens.Pocao;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Heroinas extends Entidade {

    protected int nivel;
    protected int moedas;
    protected ArmaPrincipal armas;
    protected ArrayList<Consumiveis> inventario;

    public Heroinas(String nome, int vidaMax, int vidaAtual, int forca, int nivel, int moedas) {
        super(nome, vidaMax, vidaAtual, forca);
        this.nivel = nivel;
        this.moedas = moedas;
        this.armas = null;
        this.inventario = new ArrayList<>();
    }

    public Heroinas() {

    }


    public int getNivel() {
        return nivel;
    }

    public int getMoedas() {
        return moedas;
    }

    public ArmaPrincipal getArmas() {
        return armas;
    }

    public ArrayList<Consumiveis> getInventario() {
        return inventario;
    }


    //SETTERS
    public int setMoedas(int moedas) {
        this.moedas = moedas;
        return moedas;
    }

    public void setArmas(ArmaPrincipal armas) {
        this.armas = armas;
    }

    public void adicionar_Invetario(Consumiveis itemNovo){

    this.inventario.add(itemNovo);
    }

    /**
     * Método para atacar um NPC
     * @param inimigo
     */
    public abstract void ataqueNPC(NPC inimigo);


    // usarPocao - imprimir os detalhes da pocao e perguntar qualquer usar + incrmentar vida e força

    /**
     * Método obrigatório para todas as heroinas para usar poção e restuarar a vida e força
     */
    public void usarPocao(Heroinas heroinaEscolhida){

        System.out.println("Gata bora recueperar?\n" +
                "Aqui esta a lista de poções: ");

        //Ciclo para mostar as poções no invetário e o seu preço:
        int contador = 1;
        for(Consumiveis pocaoAtual : inventario){
            System.out.println(contador + "-" + pocaoAtual.getNome() + "\t|Preço: " + pocaoAtual.getPrecoItem());
            contador++;
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Quer usar alguma?\n" +
                "É só digitar o numero da poção");

        int opcao = input.nextInt();
        if(opcao >= 1 && opcao <= inventario.size()){
           Consumiveis pocaoEscolhida = inventario.get(opcao - 1);
            if(moedas >= pocaoEscolhida.getPrecoItem()){
                Pocao usarPocao = (Pocao) pocaoEscolhida;
                int vidaCurada;
                vidaCurada = heroinaEscolhida.getVidaAtual() + usarPocao.getVida();
                //Verificar se a vida não ultrapassa a vida máxima
                if(heroinaEscolhida.getVidaMax() <= vidaCurada){
                    usarPocao.setVida(vidaCurada);
                }


            }

        }

    }

    // metodo atacar

}