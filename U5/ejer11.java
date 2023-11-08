package U5;
import java.util.Scanner;
public class ejer11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = s.nextInt();
        int cant = 1;
        for(int i = 1; i > 5 ; i++){
            cant = num + i;
            System.out.println(cant + "   " + Math.pow(cant, 2)+ "   " + Math.pow(cant, 3));

        } 
        s.close();
    }
}
