package U7;

import java.util.Scanner;

public class ejer14 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String[] palabras = new String[8];
    String[] colores = new String[9];
    colores[0] = "verde";
    colores[1] = "rojo";
    colores[2] = "azul";
    colores[3] = "amarillo";
    colores[4] = "naranja";
    colores[5] = "rosa";
    colores[6] = "negro";
    colores[7] = "blanco";
    colores[8] = "morado";

    String[] fin = new String[8];
    int orden = 0;
    String palabra;
    for (int i = 0; i < 8; i++) {
      System.out.print(i + ": ");
      palabra = s.nextLine();
      palabras[i] = palabra;
    }
    int y = 0;
    String fin2[] = new String[8];
    int orden2 = 0;
    for (int i = 0; i < 8; i++) {
      for (int x = 0; x < 9; x++) {
        if (palabras[i].equals(colores[x])) {
          fin[orden] = palabras[i];
          orden++;
          y++;
        }else{
          fin2[orden2] = palabras[i];
          orden2++;
        }
      }
    }
    for (int i = 0; i < y; i++) {
      System.out.println(fin[i]);
    }
    for(int i = 0; i<8-y;i++){
      System.out.println(fin2[i]);
    }
    s.close();
  }
}