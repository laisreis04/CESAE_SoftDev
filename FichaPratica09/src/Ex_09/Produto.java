package Ex_09;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        //não aparece como parametro, pois já foi inicializada
        this.quantidade = 0;
    }

    /**
     * Método para comprar produtos
     * @param acresQuantidade
     * @return
     */
    public int compra(int acresQuantidade){


        if (this.quantidade > 0){

            System.out.println("Quebra no stock");
        }
        this.quantidade+=acresQuantidade;
        System.out.println("Stock: " + this.quantidade);
            return this.quantidade;
        }

        public  int venda(int menosQuantidade){

        this.quantidade -= menosQuantidade;
            System.out.println("Stock: " +  this.quantidade);
        return this.quantidade;

        }

    }

