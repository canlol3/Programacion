package Arrays;

public class Voltear {
    public static int[] getVoltear(int[] array){
        int[] ArrayVolteado = new int[array.length];
        int x = 0;
        for(int i = array.length-1; i>=0 ;i--){
            ArrayVolteado[x] = array[i];
            x++;
        }
        return ArrayVolteado;
    }
}
