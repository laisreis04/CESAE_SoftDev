package Ex_04;

public enum Acabamento {
    RESTAURO, USADA, NOVA, NOVA_COM_ALTO_ACABAMENTO;

    public double calcularValorAcabamento(double valorFinalAcabamento){

        if(this == RESTAURO){
            return valorFinalAcabamento*0.5;
        }else if (this == USADA) {
            return valorFinalAcabamento*0.9;
        }else if(this == NOVA_COM_ALTO_ACABAMENTO){
            return valorFinalAcabamento *= 0.25;
        }
        return 0;
        }
    }
    

