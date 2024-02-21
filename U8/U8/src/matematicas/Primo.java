package matematicas;

public class Primo {

  public static boolean EsPrimo1(int num) {
    for (int i = 2; i < num; i++) {
      if ((num % i) == 0) {
        return false;
      }
    }
    return true;
  }
}
