package U6;
import java.util.Scanner;
public class ejer17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la altura de la pecera ");
        int altura = s.nextInt();
        System.out.print("Introduce el ancho de tu pecera ");
        int ancho = s.nextInt();
        int pez = (int)(Math.random()*ancho)+1;
        int pez_altura = (int)(Math.random()*altura)+1;
   
        for (int i = 0; i<altura; i++){
            for(int estrellas =0; estrellas<ancho+1; estrellas++){
                if(i == 0 && estrellas<ancho){
                System.out.print(" *");
                }if(i >0 && estrellas == 1 && i <altura-1 || i>0 && estrellas==ancho && i <altura-1 ){
                    System.out.print(" *");
                }if(i >0 && estrellas > 1 && estrellas<ancho && i <altura-1){
                    if(estrellas == pez && pez_altura == i){
                        System.out.print("🐟​");
                    }else{
                    System.out.print("  ");

                    }
                }if(i == altura-1 && estrellas<ancho){
                    System.out.print(" *");
                }

            }
            
            System.out.println();
        }
        
    }
}
