package Ex_04;

public class main4 {
    public static void main(String[] args) {

        Imovel apartamentoBolhao = new Imovel("Rua do Bolhão", 125, "Portugal", TipoMoradia.APARTAMENTO, Acabamento.RESTAURO, 140, 4, 2, 0);



        apartamentoBolhao.exibirdados();
        System.out.println("******** VALOR ********");
        apartamentoBolhao.valorImovel();

    }







}
