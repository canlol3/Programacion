package U7;

public class Zejer1 {
    public static void main(String[] args) {
        int[][] num = new int[3][6];
        num[0][0]= 0;
        num[0][1]= 30;
        num[0][2]= 2;
        num[0][5]= 5;
        num[1][0]= 75;
        num[1][4]= 0;
        num[2][2]= -2;
        num[2][3]= 9;
        num[2][5]= 11;
        System.out.print("Array num Columna 1 Columna 2 Columna 3 Columna 4 Columna 5");
        System.out.println();
        int fila = 0;
        for(int i = 0; i<3; i++){
            for(int z= 0; z<6; z++){
                if(z == 0){
                    System.out.print("fila "+ fila + "    ");
                    fila++;
                }
                System.out.printf("  " + num[i][z] + "     ");
                
            }
            System.out.println();
        }


    }
}
