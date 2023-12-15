package U7;
import java.util.Scanner;
public class ejer6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int teclado = 0;
        int[] num = new int[14];
        for(int i= 0; i<14; i++){
            num[i] = s.nextInt();
        }
        int i = 0;
        for( int voltear = 14; voltear<=0; voltear--){
            num[i] = num[voltear];
            i++;
        }
        for(int escribir = 0; escribir <15; escribir ++){
            System.out.print(num[escribir]);
        }
    }
}
