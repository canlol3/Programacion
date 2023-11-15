package U5;

import java.util.Scanner;

public class ejer19 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce la altura de la pirámide");
    int altura = s.nextInt();

    for (int i = 0; i < altura; i++) {
      for (int espacios = 0; espacios <= altura-i+1; espacios++) {
      System.out.print(" ");
      }
      for (int estrellas = 0; estrellas <= i*2; estrellas++ ){
      System.out.print("\033[32m*");
      }
      System.out.println();

      
    }
    System.out.println("\033[37m ");
    s.close();
  }
}
