package Ex_06;

public class Calculadora {

    public Calculadora() {
    }

    /**
     * Metodo para somar
     * @param a
     * @param b
     * @return
     */
    public double adicao(double a, double b){
        double resultado = 0;
        resultado = a + b;
        return resultado;

    }

    /**
     * Método para subtrair
     * @param a
     * @param b
     * @return
     */

    public  double subtracao (double a, double b){
        double resultado = 0;
        resultado = a - b;
        return resultado;
    }

    /**
     * Método para multiplicar
     * @param a
     * @param b
     * @return
     */

    public double multiplicacao(double a, double b){
        double resultado = 0;
        resultado = a * b;
        return resultado;
    }

    /**
     * Método para dividir
     * @param a
     * @param b
     * @return
     */

    public double divisao (double a, double b){
        double resultado = 0;
        resultado = a / b;
        return resultado;
    }


    }

