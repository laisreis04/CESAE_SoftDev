package FichaPratica06;

public class Ex_03 {


    /**
     * Método que avalia se um número é par ou impar
     *
     * @param num - Numéro a ser avaliado
     * @return True se for par || False - Se for Impar
     */
    public static boolean par(int num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método para avaliar se o número é positivo
     *
     * @param num - Número a ser avaliado
     * @return - True - 0 ou Positivo || False - Negativo
     */
    public static boolean positivo(int num) {
        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método para avaliar se um número é primo.
     *
     * @param num - Número a ser avaliado
     * @return - True - primo || False - Não é primo
     */
    public static boolean primo(int num) {

        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Método para avaliar se o número é perfeito
     * @param num - Número a ser avaliado
     * @return - True - Perfeito || False - Não é perfeito
     */
    public static boolean perfeito(int num) {

        int soma = 0;

        for (int divisor = 1; divisor < num; divisor++) {
            if (num % divisor == 0) {
                soma = soma + divisor;
            }
        }
        if (num == soma) {
            return true;
        }
        return false;
    }

    /** Método para avaliar se o número é triangular.
     * @param num - Numero que será avaliado
     * @return True - se for triangular || False - senão for triangular
     */
    public static boolean triangular(int num){
        
        int tri = 0;

        
       for(int s = 1; s < tri; s++){
        if(s == num){
            s = s + tri;
            tri++;
        }
        return true;
       }
       return false;

        }

        }
       
    
