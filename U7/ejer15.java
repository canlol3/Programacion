package U7;
import java.util.Scanner;
public class ejer15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] mesas = new int[10];
        for( int i = 0; i<10; i++){
            mesas[i] = (int)(Math.random()*5);
            System.out.print(" mesa nº" + (i+1) + " "+ mesas[i]);
            System.out.println();
        }
        System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
        int cant = s.nextInt();
        int a = -1;
        for(int i = 0; i<10; i++){
            a++;
            if(mesas[i] == 0){
             i=i+10;   
            }
        }
        int e = -1;
        if(a == 9 ){
            for(int i = 0; i<10; i++){
                e++;
            if(cant + mesas[i] <= 4){
                i = i+10;
            }
            }
            System.out.print("tu sitio es la mesa "+ (e+1) ); System.out.println();
        }else{
            System.out.print("tu sitio es la mesa "+ (a+1)); System.out.println();
        }
        s.close();
    }
}
