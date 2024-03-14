package U11;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ejer5 {
    public static void main(String[] args) {
        try{
        BufferedReader br = new BufferedReader(new FileReader("ejer4.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("sinConmentarios.java"));
        String linea = " ";
        String linea_arreglada = " ";
        int i = 0; 
        while (linea != null ) {
            i = linea.indexOf("/*");
            if(i != -1 ){
            linea_arreglada = linea.substring(0, i);
            System.out.println(linea_arreglada + " ");
            bw.write(linea_arreglada +"\n");
            }else{
            System.out.println(linea + " ");
            bw.write(linea + "\n");
            }
            linea = br.readLine();
        }
        br.close();
        bw.close();
        }catch(IOException e){
            System.out.println("ERROR");
        }
        

    }
}
