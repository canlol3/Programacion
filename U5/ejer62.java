package U5;

import java.util.Scanner;

public class ejer62 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número y te dire si es afortunado o no");
        double num = s.nextDouble();
        int digitos= 0;
        double num2 = num;
        while (num2>1) {
            num2 =num2/10;
            digitos++;
        }
        int ultima_cifra = 0;
        int afortunado = 0;
        int no_afortunado = 0;
        int ultimo_numero = (int)num;
        for(int i = 0; i<digitos;i++ ){
            ultima_cifra = (int)num%10;
            num = (int)num/10;
            if(ultima_cifra ==3||ultima_cifra ==7|| ultima_cifra ==8|| ultima_cifra ==9){
                afortunado++;
            }else{
                no_afortunado++;
            }

        }
        if(afortunado>no_afortunado){
        System.out.printf("\033[033mEl %d es un número afortunado\u001B[0m \n",ultimo_numero);

        }else{
            System.out.printf("\033[031mEl %d no es un número afortunado\u001B[0m \n",ultimo_numero);
        }
    }
}
