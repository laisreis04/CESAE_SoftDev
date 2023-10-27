package FichaPratica03;

public class Ex_06 {

    public static void main(String[] args) {

        int num = 1, soma = 0;

        while(num >= 1 && num <= 100){
            System.out.println(num); // para fazer o looping dos numeros 1 a 100
            soma = soma + num;  // quando ele chega aqui, ele vai somar o numero inicial ao proximo numero
            num++;     // só posso ter 1 incremento
        }
        System.out.println("Soma: " + soma);

    }
}
