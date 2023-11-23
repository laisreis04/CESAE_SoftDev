package Ex_02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {

    private double premio;

    private ArrayList<Pessoa> participantes;

    public Sorteio(double premio) {
        this.premio = premio;
        this.participantes = new ArrayList<>();
       }

    /**
     * Método para adicionar pessoas ao Array 
     * @param novaPessoa
     */
    public void addParticipante(Pessoa novaPessoa) {

        if (novaPessoa.getIdade() >= 18) {

            this.participantes.add(novaPessoa);

            System.out.println(novaPessoa.getNome() + " Parabéns! Adicionado com sucesso");
        }else  {

            System.out.println(novaPessoa.getNome() + " Atenção! É menor de idade");
        }
    }



        public void imprimirListaParticipantes(){

        int contador = 1;
            for(Pessoa pessoaAtual: this.participantes){
                System.out.print( contador++ + "- ");
                pessoaAtual.exibir_Dados();
            }
        }

        public Pessoa sortear_participantes(){

            Random random = new Random();


                //Tenho que colocar a lista de onde eu quero fazer o sorteio
                ArrayList<Pessoa> ganhador = this.participantes;

                //Vai sortear pelo index
                int sorteioAleatorio = random.nextInt(this.participantes.size());

                //retorno a lista de participantes + o get para acessar o sorteio
                return this.participantes.get(sorteioAleatorio);





        }
        
        
        

    }




    

