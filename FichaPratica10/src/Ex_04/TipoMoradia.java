package Ex_04;

public enum TipoMoradia {
    APARTAMENTO, CASA, MANSÃO;

    public double calcularValorMoradia(double areaMoradia){

        if(this == APARTAMENTO){
            return areaMoradia *1000;
        }else if (this == CASA) {
            return areaMoradia*3000;
        }else if (this == MANSÃO) {
            return areaMoradia*5000;
        }
        return 0;
    }
}
