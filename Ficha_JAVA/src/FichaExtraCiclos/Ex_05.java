package FichaExtraCiclos;

public class Ex_05 {

    public static void main(String[] args) {
        
        int line, coluna, spaceLine = 5, num = 1;

        line = 5;
        coluna = 1;

        for(int a = 1; a <= line; a++){
            System.out.println("  ");
            for(int b = 1; b <= coluna; b++){
                System.out.print(num);
                
            }
            num++;
            coluna++;
    }
    System.out.println("\n");

    line = 5;
    coluna = 1;
    num = 1;

        for(int a=1;a <= line;a++){
            spaceLine = line - a;
            for(int e = 0;e <= spaceLine; e++){
                System.out.print(" ");
            } coluna = 2 * a - 1;
            for(int b = 1;b <= coluna; b++){
                System.out.print(num);
            }
            num++;
            coluna++;
            System.out.println();
            spaceLine--;
        }
}
}
    

