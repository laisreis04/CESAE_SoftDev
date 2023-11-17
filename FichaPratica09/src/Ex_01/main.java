package Ex_01;

public class main {

    public static void main(String[] args) {

        Pessoa lais =  new Pessoa("Laís Reis", 35, 1.6);
        Pessoa jota =  new Pessoa("Jota Ferreira", 28, 1.75);

        System.out.println("Nome: " + lais.getNome());
        System.out.println("Idade: " + lais.getIdade());
        System.out.println("Altura: " + lais.getAltura() + "\n");

        System.out.println("Nome: " + jota.getNome());
        System.out.println("Idade: " + jota.getIdade());
        System.out.println("Altura: " + jota.getAltura()+ "\n");

        lais.setIdade(25);

        System.out.println("Nome: " + lais.getNome());
        System.out.println("Idade: " + lais.getIdade());
        System.out.println("Altura: " + lais.getAltura()+ "\n");

    }
}
