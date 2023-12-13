package U6;

public class ejer18 {

  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      int color = (int) (Math.random() * 6);
      switch (color) {
        case 0:
          System.out.print(" rojo");
          break;
        case 1:
          System.out.print(" azul");

          break;
        case 2:
          System.out.print(" verde");

          break;
        case 3:
          System.out.print(" amarillo");

          break;
        case 4:
          System.out.print(" violeta");

          break;
        case 5:
          System.out.print(" naranja");

          break;
      }
      
    }
    System.out.println();
  }
}
