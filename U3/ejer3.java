package U3;
import java.util.Scanner;
public class ejer3 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Cuantas pesetas quieres pasar a euros");
        float cant = Integer.parseInt(a.nextLine());
        System.out.println(cant/166.386);

    }
}
