package U6;

import java.util.Scanner;

public class ejer14 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Dime un número y lo intentare adivinar (menor que 100) ");
    int num = s.nextInt();
    int intentos = 0;
    int random = 0;
    int maximo = 100;
    int minimo = 0;
    do {
      random = (int) (Math.random() * maximo)+minimo;
      System.out.print(random + " Este número es mayor o menor al tuyo??\n");
      String menor_o_mayor = s.nextLine();
      if(menor_o_mayor.equals("menor")){
        maximo = maximo - random;
        minimo = minimo + random;
      }if(menor_o_mayor.equals("mayor")){
        minimo = minimo + random;
        maximo = maximo -minimo;
      }
      intentos++;
    }while (random != num || intentos < 6);
        
    s.close();
  }
}
