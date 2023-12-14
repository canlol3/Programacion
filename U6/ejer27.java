package U6;

import java.util.Scanner;

public class ejer27 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print(
      "Turno del jugador ( introduzca piedra, papel o tijeras): "
    );
    String jugador = s.nextLine();
    int npc = (int) (Math.random() * 3);
    String npc2 = "hola";
    if (npc == 0) {
      npc2 = "piedra";
    }
    if (npc == 1) {
      npc2 = "papel";
    }
    if (npc == 2) {
      npc2 = "tijeras";
    }
    System.out.print("Mi turno: " + npc2);
    System.out.println();
    if (jugador.equals(npc2)) {
      System.out.println("Empate");
    }
    if (
      jugador.equals("piedra") &&
      npc2.equals("tijeras") ||
      jugador.equals("tijeras") &&
      npc2.equals("papel") ||
      jugador.equals("papel") &&
      npc2.equals("piedra")
    ) {
      System.out.println("Gana el jugador");
    }
    if (
      npc2.equals("piedra") &&
      jugador.equals("tijeras") ||
      npc2.equals("tijeras") &&
      jugador.equals("papel") ||
      npc2.equals("papel") &&
      jugador.equals("piedra")
    ) {
      System.out.println("Gana la maquina");
    }
    s.close();
  }
}
