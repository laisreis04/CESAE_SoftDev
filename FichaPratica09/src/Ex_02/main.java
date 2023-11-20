package Ex_02;

public class main {

    public static void main(String[] args) {

        Cao  cao01 = new Cao("Pandora", "Rafeira", "Au, au, au" );
        Cao cao2 = new Cao("Ghost", "Galgo", "Au, au, au" );
        Cao cao3 = new Cao("Maila", "Schinawzer", "Au, au, au" );

        System.out.println("Dados cao 01");
        System.out.println("Nome. " + cao01.getNome());
        System.out.println("Raça: " +cao01.getRaca());
//        System.out.println("Latido: " + cao01.latir() + "\n");


        System.out.println("Dados cao 02");
        System.out.println("Nome. " + cao2.getNome());
        System.out.println("Raça: " +cao2.getRaca());
//        System.out.println("Latido: " + cao2.latir() + "\n");



        System.out.println("Dados cao 03");
        System.out.println("Nome. " + cao3.getNome());
        System.out.println("Raça: " +cao3.getRaca());
//        System.out.println("Latido: " +cao3.latir() + "\n");






    }
}
