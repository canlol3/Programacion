package U5;
import java.util.Scanner;
public class ejer10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean a = true;
        int cant = 0;
        int num2 = 0;
        while (a ==true) {
            int num = s.nextInt();
            if (num < 0 ){
                a = false;
                break;
            }
            cant++;

            num2 = num2+num;
        }
        System.out.println(num2/cant);
        s.close();
    }
} 