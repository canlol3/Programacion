package Arrays;

public class DondeNum {
    public static int getDonde(int[] array, int num){
        int posicion = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] == num){
                posicion = i;
            }
        }
        return posicion;
    }
}
