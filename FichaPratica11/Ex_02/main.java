package Ex_02;

public class main {

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("Vanessa", 35, "7895462121", "skater_torres@letsgo.com");
        Pessoa pessoa2 = new Pessoa("Leticia", 28, "452365458", "leticiaBufoni@redbull.com");
        Pessoa pessoa3 = new Pessoa("Rayssa", 15, "785456666", "fadinha@nesau.com");
        Pessoa pessoa4 = new Pessoa("Brenda", 14, "785456666", "fadinha@nesau.com");


        // Para construir a lista de participantes,
        Sorteio herWheels = new Sorteio(10000);

        // Adicionar
        herWheels.addParticipante(pessoa3);
        System.out.println();

        herWheels.imprimirListaParticipantes();




 
    }
    
}
