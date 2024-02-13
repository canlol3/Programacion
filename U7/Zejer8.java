package U7;
import java.util.Scanner;
public class Zejer8 {
    public static void main(String[] args) {
        int tablero[][] = new int[8][8];
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la posición del alfil: ");
        String posición = s.nextLine();
        int columna = posición.charAt(0);
        int fila = posición.charAt(1);
        fila = fila-49;
        columna = columna-97;
        System.out.println(columna + " " + fila);
        tablero[fila][columna] = 1;
        System.out.println("Tu álfil se puede mover a las siguientes posiciones: ");
        for(int i = 0; i<8; i++){
            for(int z  =0; z<8; z++){
                if((Math.abs(fila - i) == Math.abs(columna-z)) &&(! ((fila == i) &&  (columna == z)))){
                    System.out.print((char)(z+96)+ ""+ i +" ");
                }
            }
        }
    }
}
