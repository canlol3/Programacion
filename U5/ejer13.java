package U5;
import java.util.Scanner;
public class ejer13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double positivos = 0;
        double negativos = 0;
        double ceros = 0;
        for (int i = 0; i<10; i++){
            System.out.println("Introduce un número");
            int num = s.nextInt();
            if (num==0){
                ceros++;
            }else if(num>0){
                positivos++;
            }else{
              negativos++;
            }
            
        }
           System.out.printf("Has puesto %.0f ceros, %.0f números positivos y %.0f negativos \n",ceros,positivos,negativos);
           s.close();
    }
}
