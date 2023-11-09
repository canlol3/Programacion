package U5;
import java.util.Scanner;
public class ejer14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la base de la potencia");
        double base = s.nextDouble();
        double expo;
        do{
        System.out.println("Itroduce el exponente");
         expo = s.nextDouble();
        }while(expo <=0);
        System.out.printf("%.0f\n",Math.pow(base,expo));    
        s.close();
    }
}
