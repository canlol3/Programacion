package ArraysBi;

public class PuntoSilla {
    public static boolean getPunto(int[][] Array, int num,int filas,int columnas){
        // Verificar si el valor es el mínimo en su fila
        for (int i = 0; i < Array[0].length; i++) {
            if (Array[filas][i] < num) {
                return false;  // No es mínimo en su fila
            }
        }

        // Verificar si el valor es el máximo en su columna
        for (int i = 0; i < Array.length; i++) {
            if (Array[i][columnas] > num) {
                return false;  // No es máximo en su columna
            }
        }
        return true;
    }
}
