package Arrays;

public class MinimoArray {
    public static int getMinimo(int[] array, int columna, int max){
    int minimo = max;
        for(int i = 0; i<columna; i++){
            if(array[i] < minimo){
                minimo = array[i];
            }
        }
        return minimo;
    }
}
