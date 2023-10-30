package FichaExtraCiclos;

public class Ex_02 {

    public static void main(String[] args) {


        for(int num = 1; num <= 255; num++){
            if(num % 3 == 0){
                System.out.println(num);
            }
        }
        // Usando o While
        /*int num = 1;

        while(num <= 255){
            if(num % 3 == 0){
                System.out.println(num);
            }
            num++;
        }*/

    }
}
