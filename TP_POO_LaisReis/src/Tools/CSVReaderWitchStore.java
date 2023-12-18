package Tools;

import Domain.Players.Heroinas;
import Domain.WitchStore.ItemHeroina;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReaderWitchStore {

    private String filePath;



    //Construtor
    public CSVReaderWitchStore (String filePath){

        this.filePath = filePath;

    }

    public ArrayList<ItemHeroina> readCSVtoRepository () throws FileNotFoundException{

        File file = new File(filePath);

        Scanner sc = new Scanner(file);

        String linha = sc.nextLine();

        ArrayList<ItemHeroina> arrayItens = new ArrayList<>();

        while (sc.hasNextLine()){
            linha = sc.nextLine();
            String[] linhaDividida = linha.split(";");

            String tipo = linhaDividida[0];
            String nome = linhaDividida[1];
            int preco = Integer.parseInt(linhaDividida[2]);

            //Ler o segundo arrayList

            //? Está certo?
            String[] heroinaPermitida = linhaDividida[3].split(",");


            int ataque = Integer.parseInt(linhaDividida[4]);
            int ataqueEspecial = Integer.parseInt(linhaDividida[5]);
            int ataqueInstanteneo = Integer.parseInt(linhaDividida[6]);
            int vida = Integer.parseInt(linhaDividida[7]);
            int forca = Integer.parseInt(linhaDividida[8]);

            ItemHeroina itemAtual = new ItemHeroina(tipo, nome, preco, heroinaPermitida, ataque, ataqueEspecial,ataqueInstanteneo, vida,forca);




        }

    }



}
