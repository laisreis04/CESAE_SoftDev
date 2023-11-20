package Ex_02;

public class main {

    public static void main(String[] args) {

        Cao  cao01 = new Cao("Pandora", "Rafeira", "Au, au, au" );
        Cao cao2 = new Cao("Ghost", "Galgo", "Au, au, au" );
        Cao cao3 = new Cao("Maila", "Schinawzer", "Au, au, au" );

       cao01.latir();
        cao2.latir();
        cao3.latir();

        cao3.setLatido("Ruuuf ruuf");
        System.out.println();

        cao2.latir();




    }
}
