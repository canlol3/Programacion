/*
 * Este programa voltea los números
 * 
 * autor : Jose Maria
 * versión : 1.0
 */



package U5;
import java.util.Scanner;
public class ejer52 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número");
        double num = s.nextDouble();
        int digitos = 0;
        int num2 = (int)num;
        while(num2>0){
            num2 = num2/10;
            digitos++;
        }
        for(int i = 0; i<digitos; i++){
            int num3 = (int) num;
            num3=(int)num%10;
            num = num/10;
            System.out.print(num3);
        }
        System.out.println();
        s.close();
    }
}
