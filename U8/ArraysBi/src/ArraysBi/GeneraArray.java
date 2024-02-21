package ArraysBi;

public class GeneraArray {
    public static int[][] getArray(int fila, int columna, int max, int min){
        int[][] array = new int[fila][columna];
        for(int fila2 =0; fila2<fila; fila2++){
            for(int columna2 = 0; columna2<columna; columna2++){
                array[fila2][columna2] = (int)(Math.random()*max);
                if(array[fila2][columna2]<min){
                    array[fila2][columna2] = array[fila2][columna2]+max;
                }if(array[fila2][columna2]>max){
                    array[fila2][columna2] = array[fila2][columna2]-min+1;
                }
            }
        }
        return array;
    } 
}
