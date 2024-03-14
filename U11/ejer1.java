package U11;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
 class ejer1 {
    public static boolean esPrimo(int x){
        for (int i = 2; i < x; i++) { if ((x % i) == 0) {
            return false; }
        }
        return true;
    }
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos1.dat"));
            for(int i = 0; i<501; i++){
                if(esPrimo(i)){
                    bw.write(i + "\n");
                }
            }
            bw.close();
        }catch(IOException e ){
            System.out.println("Error");
        }
    }
}
