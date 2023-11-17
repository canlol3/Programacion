package U5;

import java.util.Scanner;

public class ejer38 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce la altura de la pirámide");
    int altura = s.nextInt();
    altura = altura/2;
    if(altura >3 && altura%2==0){

    
    for (int i = 0; i < altura; i++) {
      for (int estrellas = 0; estrellas <= i ; estrellas++) {
        System.out.print(" ");
      }
      for (int espacios = 0; (espacios+1)/2 <= altura-i-1; espacios++) {
        System.out.print("*");
      }

      System.out.println();
    }
    
    for (int i = 0; i < altura; i++) {
      for (int espacios = 0; espacios+2 <= altura-i+1; espacios++) {
      System.out.print(" ");
      }
      for (int estrellas = 0; estrellas <= i*2; estrellas++){
      System.out.print("\033[32m*");
      }
      System.out.println();

      
    }
    System.out.println("\033[37m ");
    }else{
      System.out.println("Debe introducir un número par y mayor o igual que tres");
    }
    s.close();
  }
}
