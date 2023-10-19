package U3;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args){
try (Scanner s = new Scanner(System.in)) {
    System.out.println("Introduce un número porfavor");
    int num1 = Integer.parseInt(s.nextLine());
    System.out.println("Introduce otro número porfavor");
    int num2 = Integer.parseInt(s.nextLine());
    System.out.println("La multiplicación de sus números es: " + num1 * num2);
} catch (NumberFormatException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
    }
}
