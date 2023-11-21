package Ex_01;

public class main1 {
    public static void main(String[] args) {

        Carro seat = new Carro("Seat", "Arona", 2020,120,1200, TipoCombustivel.GASOLINA,7.5);
        Carro dogde = new Carro("Dodge", "V8", 1988, 500,2500,TipoCombustivel.DIESEL, 15);
        Carro ferrari = new Carro("Ferrari", "Fiel", 2010, 260,1800,TipoCombustivel.GASOLINA,12.5);

        //Teste Ligar
//        seat.ligar();
//        dogde.ligar();
//        ferrari.ligar();

        //Teste Corrida
//        System.out.println("******** VENCEDOR *********");
//         Carro vencedor = seat.corrida(ferrari);
//         vencedor.exibirDetalhes();

        //Teste Km/l
        dogde.consumo(97);
        seat.consumo(97);




    }
}
