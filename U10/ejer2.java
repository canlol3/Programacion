package U10;

import java.util.ArrayList;

public class ejer2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int tamaño = (int)(Math.random()*10)+10;
        for(int i= 0; i<tamaño;i++){
            numeros.add((int)(Math.random()*101));
        }
        System.out.println(numeros);
        int suma = 0;
        int maximo = 0;
        int minimo = 100;
        for(int n : numeros){
            suma += n; 
            if(n < minimo){
             minimo = n;
            }
            if(n > maximo){
             maximo = n;
            }
        }
        System.out.println("El total es: "+ suma);
        System.out.println("El maximo es: " + maximo);
        System.out.println("El minimo es: " + minimo);
        System.out.println("La media es: " + suma/tamaño);
    }
}
