package U5;
import java.util.Scanner;
public class ejer15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la base");
        int base = s.nextInt();
        int expo;
        do{
        System.out.println("Introduce el exponente positivo");
        expo = s.nextInt();
        }while (expo<= 0 );

        for(int i = 1;i <= expo; i++){
            System.out.print("2^"+i+" es igual a "); System.out.printf("%.0f \n",Math.pow(base, i));
            
        }
        s.close();
    }
}
