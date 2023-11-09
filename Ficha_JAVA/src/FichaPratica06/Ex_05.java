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

    /**
     * Função para avalaioar qual o menor elemento de uma array
     * @param menor - Atributo para avalei o menor elemento
     * @return - O menor elemento do array.
     */
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

    /**
     * Função que avalia se o array está em ordem crescente ou decrescente
     * @param ordem - Atributo para avalivar o array.
     * @return - True - Crescente || False - Descescente
     */
    public static boolean crescente(int[] ordem){


        for(int i = 1; i < ordem.length; i++){
            if(ordem[i] <= ordem[i -1]){
                return false;
            }
        }
        return true;
    }
}
