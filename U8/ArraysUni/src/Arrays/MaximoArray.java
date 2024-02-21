package Arrays;

public class MaximoArray {
    public static int getMaximo(int[] array, int min ){
        int maximo = 0;
        for(int i = 0; i<array.length;i++){
            if(array[i] > maximo){
                maximo = array[i];
            }
        }
        return maximo;
    }
}
