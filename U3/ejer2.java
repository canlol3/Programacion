package U3;
import java.util.Scanner;
public class ejer2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la cantidad de euros que quieres pasar a pesetas");
        float cant = Integer.parseInt(s.nextLine());
        System.out.println(cant * 166.386);
}
}
