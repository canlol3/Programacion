package U11;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ejer2 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("primos1.dat"));
            String linea = " ";
            while (linea != null) {
                System.out.print(linea +" ");
                linea = br.readLine();
            }
            br.close();
        }catch (IOException e){
            System.out.println("Error de lectura.");
        }
    }
}
