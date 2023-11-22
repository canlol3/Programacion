package U5;

import java.util.Scanner;

public class ejer58 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        double num = s.nextDouble();
        double digitos = 0;
        int num2 = (int)num;
        double sum = 0;
        while(num2>0){
            num2 = num2/10;
            digitos++;
        }
        for(int i = 0; i<digitos; i++){
            int num3 = (int) num;
            num3=(int)num%10;
            num = num/10;
            System.out.print(num3);
            sum = sum + num3;
        }
        System.out.println();
        System.out.printf("La media de tus números es %.2f\n",sum/digitos);
        s.close();
    }
}
