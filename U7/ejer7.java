package U7;
import java.util.Scanner;
public class ejer7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []num = new int[100];
        for(int i = 0; i<100; i++){
            num [i]= (int)(Math.random()*21);
        }
        System.out.print("Introduce el número que quieres cambiar ");
        int valor1 = s.nextInt();
        System.out.print("Introduce el número por el que quieres cambiarlo ");
        int valor2 = s.nextInt();
        for(int i = 0; i<100; i++){
            if( num [i] == valor1){
                num[i] = valor2;
                System.out.print(" '"+num[i]+"'");
            }if(num[i] != valor1){
                System.out.print(" "+ num[i]);
            }
        }
    }
}
