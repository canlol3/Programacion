package U7;
import java.util.Scanner;
public class Zejer2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num[][] = new int[4][5];
        int total = 0;
        for(int z = 0; z<4; z++){
        for(int i = 0; i<5; i++){
            System.out.print("--> ");
            num[z][i] = s.nextInt();
        }
        System.out.printf(" \n");
    }
    for(int z = 0; z<4;z++){
        for(int i = 0; i<5; i++){
            System.out.printf("%8d   ", num[z][i]);
            total = total + num[z][i];
        }
        System.out.printf("%3d  fila \n",z);
    }
    for(int i = 0; i<6; i++){
        if(i<5){
            System.out.print(" Columna "+ i);
        }else{
            System.out.print(total + " ");
        }
    }
    }
}
