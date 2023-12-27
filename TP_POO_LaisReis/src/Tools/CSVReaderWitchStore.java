package Tools;


import Domain.Itens.ArmaPrincipal;
import Domain.Itens.ConsumivelCombate;
import Domain.Itens.ItemHeroina;
import Domain.Itens.Pocao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReaderWitchStore {

    private String filePath;


    //Construtor
    public CSVReaderWitchStore(String filePath) {

        this.filePath = filePath;

    }

    public ArrayList<ItemHeroina> readCSVtoRepository() throws FileNotFoundException {

        File file = new File(filePath);

        Scanner sc = new Scanner(file);

        String linha = sc.nextLine();

        ArrayList<ItemHeroina> arrayItens = new ArrayList<>();

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] linhaDividida = linha.split(";");

            String tipo = linhaDividida[0];
            String nome = linhaDividida[1];
            int preco = Integer.parseInt(linhaDividida[2]);

            //Ler o segundo arrayList

            //? Está certo?
            String heroinaPermitida = linhaDividida[3];

            //Retirar os [ do array
            heroinaPermitida.replace("[", " ");
            heroinaPermitida.replace("]", " ");

            String[] divHeroinas = heroinaPermitida.split(",");


            int ataque = Integer.parseInt(linhaDividida[4]);
            int ataqueEspecial = Integer.parseInt(linhaDividida[5]);
            int ataqueInstanteneo = Integer.parseInt(linhaDividida[6]);
            int vida = Integer.parseInt(linhaDividida[7]);
            int forca = Integer.parseInt(linhaDividida[8]);

            ItemHeroina itemAtual=null;

            if (tipo.equals("ArmaPrincipal")) {
                itemAtual = new ArmaPrincipal(nome, preco, ataque, ataqueEspecial);
                for (String heroinaAtual : divHeroinas) {
                    itemAtual.addHeroinas(heroinaAtual);
                }//? pq o noe está em vermelho?
            } else if (tipo.equals("ConsumivelCombate")) {
                itemAtual = new ConsumivelCombate(nome, preco, ataqueInstanteneo);
                for (String heroinaAtual : divHeroinas) {
                    itemAtual.addHeroinas(heroinaAtual);
                }
            } else if (tipo.equals("Pocao")) {
                itemAtual = new Pocao(nome, preco, vida, forca);
                for (String heroinaAtual : divHeroinas) {
                    itemAtual.addHeroinas(heroinaAtual);

                }


            }
            arrayItens.add(itemAtual);

        }
        return arrayItens;

    }
}
