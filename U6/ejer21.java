package U6;

public class ejer21 {

  public static void main(String[] args) {
    for(int i = 0; i<5; i++){
    int moneda = (int) (Math.random() * 8);
    if (moneda == 0) {
      System.out.print("1 céntimos");
    }
    if (moneda == 1) {
      System.out.print("2 céntimos");
    }
    if (moneda == 2) {
      System.out.print("5 céntimos");
    }
    if (moneda == 3) {
      System.out.print("10 céntimos");
    }
    if (moneda == 4) {
      System.out.print("20 céntimos");
    }
    if (moneda == 5) {
      System.out.print("50 céntimos");
    }
    if (moneda == 6) {
      System.out.print("1 euro");
    }
    if (moneda == 7) {
      System.out.print("2 euro");
    }
    int lado = (int)(Math.random()*2);
    if(lado == 0){
        System.out.print(" - cara\n");
    }if(lado == 1){
        System.out.print(" - cruz\n");
    }
  }

}
}