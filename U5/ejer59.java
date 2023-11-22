package U5;

import java.util.Scanner;

public class ejer59 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la altura de tu arbol: ");
    int altura = s.nextInt();
    for (int estrella = 0; estrella < altura; estrella++) {
      if (estrella != altura / 2) {
        System.out.print("  ");
      } else {
        System.out.print("\033[33m*");
      }
    }
    for (int i = 0; altura - 2 > i; i++) {
      for (int espacios = 0; espacios <= altura - i - 2; espacios++) {
        System.out.print(" ");
      }
      for (int estrellas = 0; estrellas <= i * 2; estrellas++) {
        if (estrellas == 1 || estrellas == i * 2 - 1) {
          System.out.print("\033[0;32m^");
        } else {
          System.out.print(" ");
        }
      }
      if (i == altura - 3) {
        System.out.println();
        System.out.print("  ");

        for (int ultimo = -1; ultimo <= altura; ultimo++) {
          System.out.print("^");
        }
        System.out.println();
      }
      if(i ==altura-3){
        for(int espacios2 = 0; espacios2<altura; espacios2++){
            if(espacios2 == altura/2){
                System.out.print("\033[30mY");
            }else{
                System.out.print("  ");
            }
        }
      }
      
      System.out.println("\u001B[0m");
    }
    s.close();
  }
}
