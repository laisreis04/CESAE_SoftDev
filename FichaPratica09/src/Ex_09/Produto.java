package Ex_09;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        //não aparece como parametro, pois já foi inicializada

    }

    /**
     * Método para comprar produtos
     * @param acresQuantidade
     * @return
     */
    public void compra(int acresQuantidade){


        this.quantidade+=acresQuantidade;
        System.out.println("Stock: " + this.quantidade);

        }

        public  void  venda(int quantidade){

        if(this.quantidade >= quantidade ){
            this.quantidade -= quantidade;
            System.out.println("Atualização stock: " + this.quantidade);
        }else {
            System.out.println("Quebra no stock");
        }




        }

    }

