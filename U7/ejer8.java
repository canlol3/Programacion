package U7;

import java.util.Scanner;

public class ejer8 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] media = new int[12];
    String[] mes = new String[12];
    mes[0] = "enero";
    mes[1] = "febrero";
    mes[2] = "marzo";
    mes[3] = "abril";
    mes[4] = "mayo";
    mes[5] = "junio";
    mes[6] = "julio";
    mes[7] = "agosto";
    mes[8] = "septiembre";
    mes[9] = "octubre";
    mes[10] = "noviembre";
    mes[11] = "diciembre";
    for (int i = 0; i < 12; i++) {
        System.out.print(mes[i] + " ");
      media[i] = s.nextInt();
    }
    for(int grafica = 0; grafica <12; grafica++){
        System.out.print(" "+mes[grafica] + " ");
        for(int barras = 0; barras < media[grafica]; barras++){
            
            System.out.print("*");
            
        }
        System.out.println();
    }
  }
}
