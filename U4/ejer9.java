package U4;
import java.util.Scanner;
public class ejer9 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(
      "Este programa resuelve ecuaciones de segundo grado ax2+bx+c = 0"
    );

    System.out.println("Dime la a");
    double a = s.nextDouble();

    System.out.println("Dime la b");
    double b = s.nextDouble();

    System.out.println("Dime la c");
    double c = s.nextDouble();

    double x = ((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a);
    double x2 = ((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a);

    if (a == 0) {
      System.out.printf("La solución de esta ecuación de primer grado: %.0fx + %.0f \n",b,c);
      System.out.printf("%.0f\n", -c/b);
    } else {
      if ((Math.pow(b, 2) - 4 * a * c) < 0) {
        System.out.println("no tiene solución porque no existe raiz de un número negativo");
      } else {
        System.out.printf("La solución a la ecuación %.0fx2 + %.0fx + %.0f es:\n",a,b,c);
        System.out.printf("%.0f\n", x);
        System.out.printf("%.0f\n", x2);
      }
    }
    s.close();
  }
  
}
