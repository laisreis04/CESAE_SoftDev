package Ex_03;

public abstract class Document {

    private String autor;
    private String nome;
    private Extensoes extensao;

    public Document(String autor, String nome, Extensoes extensao) {
        this.autor = autor;
        this.nome = nome;
        this.extensao = extensao;
    }

    public String getAutor() {
        return autor;
    }

    public String getNome() {
        return nome;
    }

    public Extensoes getExtensao() {
        return extensao;
    }

    public abstract void open();

    public abstract void save();

    public abstract void close();

    public void exibirDetalhes(){
        System.out.println("Autor: " + getAutor());
        System.out.println("Nome: " + getNome() + "." + getExtensao());
    }

}
