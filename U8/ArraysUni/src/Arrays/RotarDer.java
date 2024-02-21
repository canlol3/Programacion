package Arrays;

public class RotarDer {
    public static int[] getRotarder(int[] array, int distancia ){
        int longitud = array.length;

        // Realizar la rotación
        for (int i = 0; i < distancia; i++) {
            int temp = array[longitud - 1];

            // Desplazar los elementos a la derecha
            for (int x = longitud - 1; x > 0; x--) {
                array[x] = array[x - 1];
            }

            array[0] = temp;
        }
        return array;
    }
}
