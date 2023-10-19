package U3;
import java.util.Scanner;
public class ejer4 {
    public static void main(String[] args){
        int x;
        int y;
        String resul;
        
        System.out.println("Introduce el primer número");
        resul = System.console() .readLine();
        x = Integer.parseInt(resul);
        System.out.println("Introduce el segundon número");
        resul = System.console() . readLine();
        y = Integer.parseInt(resul);
        
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
    }
}
