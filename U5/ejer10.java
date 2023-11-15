package U5;
import java.util.Scanner;
public class ejer10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cant = 0;
        int num2 = 0;
        int num = 0;
        while (num >= 0) {
             num = s.nextInt();
            if (num >= 0 ){
              num2 = num2+num;
              cant++;
            }
        }
        System.out.println(num2/cant);
        s.close();
    }
} 