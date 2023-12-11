package Ex_03;

import java.util.Locale;

public class DocumentFactory {

    public static Document criarDocumento (String tipoDocumento, String nome, String autor, Extensoes extensoes){

        tipoDocumento = tipoDocumento.toLowerCase();

        switch (tipoDocumento){

            case "TextoSimples":
                return new TextoSimples(nome, autor,extensoes);
            case "FolhaCalculo":
                return new FolhaCalculo(nome, autor, extensoes);
            case "Apresentacao":
                return new Apresentacao(nome, autor,extensoes);
            default:
                throw new IllegalArgumentException("Tipo de documento não reconhecido");
        }

    }
}
