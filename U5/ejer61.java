package U5;
import java.util.Scanner;
public class ejer61 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime la altura de la v");
        int altura = s.nextInt();
        int ancho = altura*2+4;
        for(int i = 0; i<altura; i++){
            for(int estrellas= 0; estrellas < ancho;estrellas++ ){

                if( estrellas<i){
                    System.out.print("2");
                }if(estrellas>i && estrellas<i+4){
                    System.out.print("*");
                 
                }if(estrellas>i && estrellas>i+4 && estrellas<ancho-i-1){
                    System.out.print("3");
                }if(estrellas>i+ancho ){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
