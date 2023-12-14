package U6;

import java.util.Scanner;

public class ejer20 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
    int capacidad = s.nextInt();
    int litros = -(int)(Math.random()*capacidad);
    for (int i = -capacidad; i <= 0; i++) {
      if (i > -capacidad && i<litros) {
        System.out.print("*    *\n");
      }if(i >= -capacidad && i >= litros ){
        System.out.print("*====*\n");
      }if(i == 0){
        System.out.print("******\n");
      }
    }
    s.close();
  }
}
