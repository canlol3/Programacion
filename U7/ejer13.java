package U7;

import java.util.Scanner;

public class ejer13 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] num = new int[100];
    int mayor = 0;
    int num_mayor = 0;
    int num_menor = 500;
    int menor = 0;
    for (int i = 0; i < 100; i++) {
      num[i] = (int) (Math.random() * 501);
      if (i > 0) {
        if (num_mayor < num[i]) {
          mayor = i;
          num_mayor = num[i];
        }
        if (num_menor > num[i]) {
          menor = i;
          num_menor = num[i];
        }
      }
      System.out.print(" " + num[i]);
    }
    System.out.println();
    int opcion = 0;
    System.out.print("¿Qué quieres destacar? (1 - maximo, 2 - mínimo): ");
    opcion = s.nextInt();
    switch (opcion) {
      case 1:
        for (int i = 0; i < 100; i++) {
          if (mayor == i) {
            System.out.print(" **" + num[i] + "**");
          }
          if (mayor != i) {
            System.out.print(" " + num[i]);
          }
        }
        break;
      case 2:
        for (int i = 0; i < 100; i++) {
          if (menor == i) {
            System.out.print(" **" + num[i] + "**");
          }
          if (menor != i) {
            System.out.print(" " + num[i]);
          }
        }
        break;
    }
    s.close();
  }
}
