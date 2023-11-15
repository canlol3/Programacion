package U5;
import java.util.Scanner;
public class ejer16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int res = 1;
        while (res == 1) {
        System.out.println("Introduce un número");
        int num = s.nextInt();
        if( num%1 > 0 && num%num > 0 ){
            System.out.println("Tu número no es primo!!");
                
        }else{
            System.out.println("Tu número es primo");
        }
        }
        s.close();
    }
}
