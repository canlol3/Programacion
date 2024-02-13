package U9.Ejercicio3;

import java.util.Scanner;

public class PruebaAnimales {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Raza: ");
    String raza = s.nextLine();
    Gato laika = new Gato(Sexo.MACHO, raza);
    Gato turron = new Gato(Sexo.HEMBRA, raza);
    System.out.println("GATOS");
    System.out.println("1. Maullar");
    System.out.println("2. Pelear");
    System.out.println("3. Info");
    int num = s.nextInt();

    switch (num) {
      case 1:
      System.out.println("Quien?");
      int num2 = s.nextInt();
      if(num2 == 1){
        System.out.print("Laika: " );
      laika.Maullar();
      }else{
        System.out.print("Turron: ");
        turron.Maullar();

      }
        break;
      case 2:
      laika.Pelar(Sexo.MACHO);
        break;
      case 3:
      laika.getInfo();
        break;
      case 4:
        break;
    }
  }
}
