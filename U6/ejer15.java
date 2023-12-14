package U6;

public class ejer15 {
    public static void main(String[] args) {
        int nota = 0;
        int cant_notas = (int)(Math.random()*6)+1;
        cant_notas = cant_notas*4;
        int primera = 0;
        for (int i = 1; i <cant_notas+1; i++){
            nota = (int)(Math.random()*7);
            if(i == cant_notas){
                nota = primera;
            }
            if(i == 1 ){
                primera = nota;
            }
            if(nota == 0){
                System.out.print(" do");
            }            if(nota == 1){
                System.out.print(" re");
            }            if(nota == 2){
                System.out.print(" mi");
            }            if(nota == 3){
                System.out.print(" fa");
            }            if(nota == 4){
                System.out.print(" sol");
            }            if(nota == 5){
                System.out.print(" la");
            }            if(nota == 6){
                System.out.print(" si");
            }
            if(i%4==0 && i>3){
                System.out.print(" |");
                if(i == cant_notas){
                    System.out.print("|");
                }
            }
            
        }
        System.out.println();
    }
}
