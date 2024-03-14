package U11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader; 
import java.io.IOException;
import java.util.Scanner;
public class ejer6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("¿Que palabra quieres buscar? ");
        String palabra = s.next();
        int ocurrencias = 0;
        int i = 0;
        try{
        BufferedReader br = new BufferedReader(new FileReader("texto.dat"));
        String linea = " ";
        while ((linea = br.readLine() )!= null) {
            
            while ((i = linea.indexOf(palabra)) != -1) {
                linea = linea.substring(i + palabra.length(), linea.length());
                 ocurrencias++;
                }
        }
        br.close();
        System.out.println(ocurrencias);
        }catch(IOException ioe){
            System.err.println(ioe.getMessage());
        }

    }
}
