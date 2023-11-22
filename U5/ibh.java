package U5;
import java.util.Scanner;
public class ibh {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número");
        double num = s.nextDouble();
        int num2 = (int)num;
        int digitos = 0;
        int num3 = 0;
        int cifra_mayor = 0;
        while(num2>0){
            num2 = num2/10;
            digitos++;
        }
        for(int i = 0; i<digitos; i++){
            num3=(int)num%10;
            num=(int)num/10;
            System.out.println(num3); 
            if(num3>num%10){
                cifra_mayor = num3;
            }
        }
        System.out.println(cifra_mayor);
        s.close();
    }
}
