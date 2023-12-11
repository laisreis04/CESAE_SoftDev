package Ex_03;

public class Apresentacao extends Document{

    public Apresentacao(String autor, String nome, Extensoes extensao) {
        super(autor, nome, extensao);
    }

    @Override
    public void open() {
        System.out.println("A abrir o documento de tipo FOLHA DE CALCULO \nNome: " + getNome() + getExtensao() );

    }

    @Override
    public void save() {
        System.out.println("Alterações do " + getAutor() + " gravadas");

    }

    @Override
    public void close() {
        System.out.println("A fechar documento de FOLHA DE CALCULO");
    }
}
