package U5;

import java.util.Scanner;

public class ejer20 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la altura de tu pirámide hueca ");
        int altura = s.nextInt();
        for (int i = 0; altura > i ; i++){
            for (int espacios = 0; espacios <= altura-i-2;espacios++){
                System.out.print(" ");
            }
            for (int estrellas = 0; estrellas <= i*2;estrellas++){
                if( estrellas ==1 || estrellas == i*2-1){
                    System.out.print("*");
                }else {
                System.out.print(" ");
                }
            }
            for( int ultimo = 0; ultimo == altura; ultimo++) {
                System.out.print("*");
            }  
            System.out.println();


        } 
        s.close();
    }

}
