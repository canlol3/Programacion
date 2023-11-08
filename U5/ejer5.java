package U5;
import java.util.Scanner;
public class ejer5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número de cuatro dígitos");
        boolean res = false;
        int a = 3;
        while (res == false  && a > -1) {
        int num = s .nextInt();
        if( num == 2005){
            System.out.println("Esa es la contraseña, muy bien");
            res = true;
        }else{
            System.out.println("Esa no es la contraseña, tienes " + a + " intentos mas" );
        }
            a--;
        }
        s.close();


    }
}
