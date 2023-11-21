package Ex_03;

public class main3 {

    public static void main(String[] args) {

        //Quando eu tenho um array de strings, eu posso criar o arrays antes e depois "chamar " no construtor
        String[] comidaBilu = {"pessoas", "animais"};
        Animal animal1 = new Animal("Bilu", "allien", "Marte", 50, comidaBilu);

        String[] comidaPandora = {"Arroz", "Ração","Patê"};
        Animal animal2 = new Animal("Pandora", "Cão", "Portugal", 5.5, comidaPandora);

        
        animal1.exibirDados();
        animal1.animalComer(50000, "pessoas");
        System.out.println();

        animal1.exibirDados();
        

    }
}
