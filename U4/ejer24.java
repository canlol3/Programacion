package U4;
import java.util.Scanner;

public class ejer24 {
    public static void main(String[] args){ 
        Scanner s = new Scanner(System.in);
        System.out.println("1 - Programador junior ");
        System.out.println("2 - Programador senior ");
        System.out.println("3 - Jefe de proyecto ");
        int pren1 = s.nextInt();
        System.out.println("¿Cuantos dias has estado de viaje?");
        int viaje = s.nextInt();
        System.out.println("Estado civil");
        System.out.println("1 - Soltero");
        System.out.println("2 - Casado");
        int civil = s.nextInt();
        double sueldo_base;
        double retencion;
        double dietas = viaje*30;
  
        if(pren1 == 1){
            sueldo_base = 950;
        }else if(pren1 == 2){
            sueldo_base = 1200;
        }else{
            sueldo_base = 1600;
        }
        double sueldo_bruto = dietas + sueldo_base;

        if(civil == 1){
            retencion = sueldo_bruto * 0.25;
        }else{
            retencion = sueldo_bruto * 0.20;
        }
        System.out.println("- - - - - - - - - - -");
        System.out.printf("%-7s      %.2f|\n","|sueldo base",sueldo_base,10);
        System.out.printf("|Sueldo base    %.2f| \n",dietas);
        System.out.println("|- - - - - - - - - - -|");
        System.out.printf("|Sueldo bruto  %.2f| \n",sueldo_bruto);
        System.out.printf("|Retención IRPF %.2f| \n",retencion);
        System.out.println("|- - - - - - - - - - -|");
        System.out.printf("|Sueldo neto   %.2f| \n",sueldo_bruto-retencion);
        System.out.println(" - - - - - - - - - - -");



    }
}
