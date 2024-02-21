import matematicas.Primo;
import matematicas.Potencia;
import matematicas.Capicua;
import matematicas.Digitos;
import matematicas.QuitarDer;
import matematicas.Adecimal;
import java.util.Scanner;

public class ejer15 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String num3 = s.nextLine();
    System.out.print("Este es el número en decimal: "+Adecimal.getdecimal(num3) );
    System.out.println();

  }
}
