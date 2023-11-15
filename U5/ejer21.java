package U5;
import java.util.Scanner;
public class ejer21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean res = true;
        int cant = 0;
        double pares = 0;
        double impares = 0;
        double sumatorio_pares = 0;
        double sumatorio_impares = 0;
        while (res = true) {
            System.out.println("Introduce un número");
            int num = s.nextInt();
            if (num >= 0 ){
                cant++;
                if ( num%2 ==0 ){
                    pares++;
                    sumatorio_pares = num + sumatorio_pares;

                }else{
                    impares++;
                    sumatorio_impares = num + sumatorio_impares;
                }
            }else{
                break;
            }
        }
        System.out.printf("La media de los números impares es %.2f\n",sumatorio_impares/impares);
        System.out.printf("La media de los números pares es %.2f\n",sumatorio_pares/pares);
        s.close();
    }
}
