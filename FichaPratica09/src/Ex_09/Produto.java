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

    public int compra(int acresQuantidade){

        //para atualizar a quantidade
        this.quantidade+=acresQuantidade;
            return this.quantidade;
        }

    }

