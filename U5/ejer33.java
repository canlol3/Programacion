package U5;
import java.util.Scanner;
public class ejer33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime la altura de la U");
        int altura = s.nextInt();
        for ( int i = 1; i < altura; i++){
            for(int estrellas=0; estrellas!=altura; estrellas++){
                if(estrellas == 0 || estrellas==altura-1){
                System.out.print("\033[035m*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int ultima=0; ultima<altura; ultima++){
            if(ultima==0 || ultima==altura-1){
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
        }
        System.out.println("\033[37m");
        s.close();
    }
}
