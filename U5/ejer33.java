package U5;
import java.util.Scanner;
public class ejer33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime la altura de la U");
        int altura = s.nextInt();
        for ( int i = 0; i <=altura; i++){
            for(int estrellas=0; estrellas!=i; estrellas++){
                if(estrellas == 0 || estrellas == 1){
                System.out.print("*");
                }else{
                }
            }
            System.out.println();
            for(int espacios=0; espacios < altura-2; espacios++){
                System.out.print("2");
            }
        }
        s.close();
    }
}
