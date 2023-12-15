package U7;
import java.util.Scanner;
public class ejer3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 0;
        int[] num2 = new int[11];
        for(int i = 0; i<10; i++){
            num = s.nextInt();
            num2[i] = num;
        }
        System.out.println();
        for(int i = 9; i>-1; i--){
            System.out.print(num2[i]);
        }
    }
}
