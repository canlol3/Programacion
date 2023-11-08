package U5;
import java.util.Scanner;
public class ejer9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = s.nextInt();
        int cant = 0;
        while (num > 0) {
            num = num/10;
            cant++;
        }
        System.out.println(cant);
        s.close();
    }
}
