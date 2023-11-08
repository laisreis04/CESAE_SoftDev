package FichaPratica06;

public class Ex_05 {
    /**
     * Função para avaliar qual o maior número num array.
     * @param maior - Parametro a ser avaliado
     * @return - O maior elemento do array
     */

    public static int maior(int[] maior){


        int maiorElemento;

        maiorElemento = maior[0];

        for(int i = 0;i < maior.length; i++){
            if(maior[i]>maiorElemento){
                maiorElemento = maior[i];
            }
        }
        return maiorElemento;
    }

    public static int menor(int[] menor){

        int menorElemento;

        menorElemento = menor[0];

        for(int i = 0;i < menor.length;i++){
            if(menor[i] < menorElemento){
                menorElemento = menor[i];
            }
        }
        return menorElemento;
    }
}
