import java.util.Scanner;

import javax.sound.midi.Soundbank;

import ArraysBi.GeneraArray;
import ArraysBi.PuntoSilla;
public class App {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce las filas");
        int filas = s.nextInt();
        System.out.println("Introduce el número de columnas");
        int columnas = s.nextInt();
        System.out.println("Numero maximo");
        int max = s.nextInt();
        System.out.println("Introduce el minimo");
        int min = s.nextInt();
        int[][] Array = GeneraArray.getArray(filas, columnas, max, min);
        for(int i =0; i<filas; i++){
            for(int x =0; x<columnas; x++){
                System.out.print(Array[i][x]+ " ");
            }
            System.out.println();
        }
        int num = s.nextInt();
        if(PuntoSilla.getPunto(Array, num, filas, columnas)){
            System.out.println("True");
        }else{
            System.out.println("false");
        }


    }
}
