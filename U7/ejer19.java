package U7;
import java.util.Scanner;
public class ejer19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []num = new int[12];
        for(int i = 0; i<12; i++){
            num[i] = (int)(Math.random()*201);
            System.out.print(" "+ i + " " + num[i]);
            System.out.println();
        }
        System.out.print("Introduzca la posición donde lo quiere insertar (0 - 11): ");
        int lugar = s.nextInt();
        System.out.print("Introduzca el número que quieres insertar: ");
        int numero = s.nextInt();
        int num_guardado = 0;
        int num_guardado2;
        for(int i = 0; i<12; i++){
            if(i == lugar){
                num_guardado = num[i];
                num[i] = numero;
                System.out.println(num_guardado);
            }if(i > lugar){
                num_guardado2 = num[i];
                num[i] = num_guardado;
                num_guardado = num_guardado2;
            }
        }
        for(int i = 0; i<12; i++){
            System.out.print(" "+ i + " " + num[i]);
            System.out.println();
        }
    }
}
