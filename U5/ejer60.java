package U5;

import java.util.Scanner;

public class ejer60 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("De que altura quieres los calcetines");
    int altura = s.nextInt();
    for (int i = 0; i < altura; i++) {
      for (int estrellas = 0; estrellas < 13; estrellas++) {
        if (estrellas < 3 && i < altura - 2 || estrellas > 8 && estrellas < 12 && i < altura - 2) {
          System.out.print("*");
        }
        if (i == altura - 2 || i == altura - 1) {
          System.out.print("\033[34m*");
        }
        if (estrellas > 3 && estrellas < 5 && i < altura - 2) {
          System.out.print("     ");
        }
        if (i > altura - 3 && estrellas == 5) {
          System.out.print("  ");
        }
      }
      System.out.println("\u001B[0m");
    }
  }
}
