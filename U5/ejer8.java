package U5;
import java.util.Scanner;
public class ejer8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce de que número quieres la tabla de multiplicar");
        int num = s.nextInt();
        int i = 1;
        while(i< 10){
            System.out.println(num*i);
            i++;
        }
        s.close();
    }
}
