package Ex_02;

import java.util.ArrayList;

public class Sorteio {

    private double Sorteio;

    ArrayList<Pessoa> participantes;



    /**
     * Método para adicionar pessoas ao Array 
     * @param novaPessoa
     */
    public void addParticipante(Pessoa novaPessoa){

        if(Pessoa.getIdade() > 18){

        this.participantes.add(novaPessoa);
            System.out.println("Parabéns! Adiconado com sucesso");
        }
        if(Pessoa.getIdade() < 18){



        }

        
        
        

    }




    
}
