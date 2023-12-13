package U6;

public class ejer11 {

  public static void main(String[] args) {
    int nota;
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    for (int i = 0; i < 20; i++) {
      nota = (int) (Math.random() * 10) + 1;
      if (nota < 5) {
        System.out.print(" suspenso");
        suspenso++;
      }
      if (nota > 4 && nota < 6) {
      System.out.print(" suficiente");
      suficiente++;
      }
      if (nota > 5 && nota < 7) {
        System.out.print(" bien");
        bien++;
      }
      if (nota > 6 && nota < 9) {
        System.out.print(" notable");
        notable++;
      }
      if (nota > 8) {
        System.out.print(" sobresaliente");
        sobresaliente++;
      }
    }
    System.out.println();
    System.out.print("Has conseguido " + suspenso + " suspensos \n");
    System.out.print("Has conseguido " + suficiente + " suficiente \n");
    System.out.print("Has conseguido " + bien + " bien \n");
    System.out.print("Has conseguido " + notable + " notables \n");
    System.out.print("Has conseguido " + sobresaliente + " sobresalientes \n");
  }
}
