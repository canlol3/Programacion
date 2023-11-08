package U4;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args){
        System.out.println("¿Que dia quieres mirar? la primera en mayusculas porfavor");
        String dia = System.console() .readLine();
            if (dia.equals("Lunes")){
            System.out.println("El lunes a primera hora tienes sistemas informáticos.");
        }
            if (dia.equals("Martes")){
            System.out.println("El martes a primera hora tienes sistemas informáticos.");
        }
            if (dia.equals("Miercoles")){
            System.out.println("El miercoles a primera hora tienes base de datos.");
        }
            if (dia.equals("Jueves")){
            System.out.println("El jueves a primera hora tienes lenguaje de marcas.");
        }
            if (dia.equals("Viernes")){
            System.out.println("El viernes a primera hora tienes base de datos.");
        }
    }
}
