package Arrays;

public class GeneraArrayInt {
    public static int[] getArray(int columna,int max,int min) {
        int[] array = new int[columna];
        for(int i = 0; i<columna; i++){
            array[i] = (int)(Math.random()*max)+min;
            if(array[i]>max){
                array[i] = array[i]-max+min;
            }
        }
        return array;
    }
}
