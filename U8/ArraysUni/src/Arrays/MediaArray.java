package Arrays;

public class MediaArray {
    public static double getMedia(int[] array){
        double sumatorio = 0;
        for(int i=0; i<array.length;i++){
            sumatorio = array[i] + sumatorio;
        }
        double media = sumatorio/array.length;
        return media;

    }
}
