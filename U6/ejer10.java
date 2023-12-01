package U6;

public class ejer10 {
    public static void main(String[] args) {
        int longitud = (int)(Math.random()*40)+1;
        int caracter;
        for(int a = 0; a<11; a++){
        for(int i = 0; i < longitud; i++){
            caracter = (int)(Math.random()*6)+1;
            if(caracter == 1){
            System.out.print(" *");
            }
            if(caracter == 2){
            System.out.print(" -");
            }
            if(caracter == 3){
            System.out.print(" =");
            }
            if(caracter == 4){
            System.out.print(" .");
            }
            if(caracter == 5){
            System.out.print(" |");
            }
            if(caracter == 6){
            System.out.print(" @");
            }
        }
        System.out.println();
    }
    }
}
