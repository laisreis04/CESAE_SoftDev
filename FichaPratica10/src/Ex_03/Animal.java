package Ex_03;

public class Animal {

        private String nome;
        private String especie;
        private String paisOrigem;
        private double pesoKg;
        private String[] alimentacao;

    public Animal(String nome, String especie, String paisOrigem, double pesoKg, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.pesoKg = pesoKg;
        this.alimentacao = alimentacao;
    }

}

    public void animalComer(double pesoGr, String comida){

        for(int i = 0; i < alimentacao.length;i++){
            if(comida.equals(alimentacao)){
                pesoKg += pesoGr*1000;
                System.out.println("Animal comeu!");
            }else {
                System.out.println("Animal recusou a comida");
            }
        }


    }
}
