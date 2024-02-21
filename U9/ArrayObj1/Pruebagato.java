package U9.ArrayObj1;
import java.util.Scanner;
public class Pruebagato {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Gato array[] = new Gato[4];
        for(int i = 0; i<array.length; i++){
            System.out.print("Nombre:");
            String nombre = s.nextLine();
            System.out.print("Edad: ");
            int edad = s.nextInt();
            System.out.print("Raza:");
            String raza = s.nextLine();
            String ad = s.nextLine();
            array[i] = new Gato(nombre, edad, ad);
            System.out.println();
            System.out.println(array[i]);
        }
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
        s.close();
    }
}
