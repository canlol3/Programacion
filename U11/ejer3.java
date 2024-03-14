package U11;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ejer3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Que fichero quieres convinar: ");
            String fichero1 = s.next();           
            String fichero2 = s.next();
            System.out.println("Nombre del fichero destinatario");
            String convinado = s.next();
            BufferedReader br1 = new BufferedReader(new FileReader(fichero1));
            BufferedReader br2 = new BufferedReader(new FileReader(fichero2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(convinado));
            String linea = " ";
            String linea2 = " ";
            while ((linea != null) || (linea2 != null)) {
                linea = br1.readLine();
                if(linea != null){
                System.out.print(linea + " ");
                bw.write(linea + "\n");
                }
                linea2 = br2.readLine();
                if(linea != null ){
                System.out.print(linea2 + " ");
                bw.write(linea2 + "\n");
                }
                
            }
            br1.close();
            br2.close();
            bw.close();
        }catch (IOException ioe){
            System.out.println("Se ha producido un error de lectura/escritura");
            System.out.println(ioe.getMessage());
        }
    }
}
