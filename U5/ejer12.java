package U5;
import java.util.Scanner;
public class ejer12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Cuantos números de la tabla de Finonacci quieres?");
        int cant = s.nextInt();
        double primer = 0;
        double segun = 1;
        for(int i = 0;i<cant; i++){
            System.out.printf("%.0f ",primer);
            primer = primer + segun;
            segun = primer + segun;
        }
        s.close();
    }
}
