package U6;
import java.util.Scanner;
public class ejer22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int longitud = s.nextInt();
        int giro = 0;
        int espacios = 12;
        for(int i = 0; i <longitud; i++){
            for(int distancia = 0; distancia<=espacios; distancia++){
                System.out.print(" ");
            }
            if(i == 0){
                System.out.print("@\n");
            }
            giro =(int)( Math.random()*3);
            if(giro == 0 && i != 0){
                System.out.print("*\n");
                espacios = espacios -1 ;
            }if(giro == 1 && i!=0){
                System.out.print("*\n");
            
            }if(giro == 2 && i!=0){
                System.out.print("*\n");
                espacios=espacios+1;
            }
        }
    }
}
