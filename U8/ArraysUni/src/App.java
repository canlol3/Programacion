import java.util.Scanner;
import Arrays.GeneraArrayInt;
import Arrays.MinimoArray;
import Arrays.MaximoArray;
import Arrays.MediaArray;
import Arrays.BuscarNum;
import Arrays.DondeNum;
import Arrays.Voltear;
import Arrays.RotarDer;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce el numero de columnas: ");
        int columna = s.nextInt();
        System.out.print("Maximo de numero: ");
        int max = s.nextInt();
        System.out.print("Minimo de numero: ");
        int min = s.nextInt();
        int[] array = GeneraArrayInt.getArray(columna, max, min);
        for(int i = 0; i<columna; i++){
        System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("El mínimo es: "+MinimoArray.getMinimo(array, columna, max));
        System.out.println();
        System.out.print("El máximo es: "+MaximoArray.getMaximo(array, min));
        System.out.println();
        System.out.print("El media es: "+MediaArray.getMedia(array));
        System.out.println();
        System.out.print("Cuanto quieres rotar a la derecha: ");
        int distancia = s.nextInt();
        int[] RotadoArray = RotarDer.getRotarder(array, distancia);
        for(int i = 0; i<array.length; i++){
            System.out.print(RotadoArray[i]+ " ");
        }
  
        System.out.println();

    }
}
