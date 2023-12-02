package Ex_05;

import java.util.ArrayList;

public class Agenda {

    private Pessoa[] contatos;

    public Agenda() {
        this.contatos = new Pessoa[30];
    }

    public void addContato (Pessoa novoContato){
        for (int i = 0;i < contatos.length; i++) {
            if(contatos[i] == null){
                contatos[i] = novoContato;
                return;
            }
        }

    }

    public void exibirDetalhes(){
        for (Pessoa contatoAtual: contatos) {
            System.out.println("Contato: \n" + contatoAtual);

        }


    }

}
