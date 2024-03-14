package U11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
        BufferedWriter bw = new BufferedWriter(new FileWriter("palabras.dat"));
        BufferedWriter bw1 = new BufferedWriter(new FileWriter("ordenado.dat"));
        String linea = " ";
        String[] array = new String[10];
        for (int i = 0; i<10; i++) {
            linea = s.next();
            bw.write(linea + "\n");
            array[i] = linea;
        }
        Arrays.sort(array);
        System.out.println();
        for(String i: array){
            bw1.write(i + "\n");
        }
        bw.close();
        bw1.close();
        s.close();
        }catch(IOException e){
            System.out.println("Error");

        }
    }
}
