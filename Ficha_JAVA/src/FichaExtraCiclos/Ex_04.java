package FichaExtraCiclos;

public class Ex_04 {

    public static void main(String[] args) {

        int repeatLine1, repeatCol1, spaceLine = 5;
        


        String aste = "*";
        char charater = aste.charAt(0);

        repeatLine1 = 4;
        repeatCol1 =10;


        for (int a = 1; a <= repeatLine1; a++) {
            for (int i = 1; i <= repeatCol1; i++) {
                System.out.print(charater);
            }
            System.out.println();  //Imprime um enter, para pular de linha
        }

        System.out.println();

        repeatLine1 = 4;
        repeatCol1 =0;

       for(int a = 0; a <= repeatLine1; a++){
            for(int c= 0; c <= repeatCol1 ; c++){
                System.out.print(charater);
            }
            repeatCol1++;
            System.out.println();
        }
        System.out.println();
        repeatLine1 = 4;
        repeatCol1 = 0;

        for(int a = 0; a <= repeatLine1; a++){
            for(int e = 0; e <= spaceLine; e++){
                System.out.print(" ");
            }for(int c= 0; c <= repeatCol1 ; c++){
            System.out.print(charater);
            }
            repeatCol1+= 2;  //usado para incrementar  + 2 ao invés de 1 só;
            System.out.println();
            spaceLine--;
        }
        


    }


}
