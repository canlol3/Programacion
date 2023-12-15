package U7;
import java.util.Scanner;
public class ejer5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = new int[10];
        for(int i = 0; i<9; i++){
            num[i] = s.nextInt();

        }
        int maximo = 0;
        for(int i = 0; i<10; i++){
            if(maximo<num[i]){
                maximo = num[i];
            }
        }
        int minimo = maximo;
        for(int i = 0; i<9; i++){
            if(minimo>num[i]){
                minimo = num[i];
            }
        }
        System.out.println("El máximo es: "+ maximo);
        System.out.println("El mínimo es: "+ minimo);
        s.close();
    }   
}
