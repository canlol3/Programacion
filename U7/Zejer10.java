package U7;
import java.util.Scanner;
public class Zejer10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tablero[][] = new int[3][3];
        int columna_x = 0;
        int fila_x= 0;
        int columna_o = 0;
        int fila_o= 0;
        System.out.println("  1 2 3");
        int y = 1;
        for(int i = 0; i<3; i++){
            System.out.print(y +"|");
            y++;
            for(int z = 0; z<3; z++){

                System.out.print(" |");
            }
            System.out.println();
        }
        System.out.println("Donde quieres poner la X: ");
        String posicion = s.nextLine();
        fila_x = posicion.charAt(0)-49;
        columna_x = posicion.charAt(1)-49;
        tablero[fila_x][columna_x] = 1;
        int turno = 1;
        char ganador = 'O';
        for(int juego = 0; juego <9; juego++){
            for(int i = 0; i<3; i++){
                for(int z = 0; z<3; z++){
                    if(tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2] && tablero[0][0] != 0 
                    || tablero[1][2] == tablero[1][1] && tablero[1][2] == tablero[2][1] && tablero[1][2] != 0
                    || tablero[0][0] == tablero[1][0] && tablero[0][0] == tablero[2][0] && tablero[0][0] != 0 
                    || tablero[1][0] == tablero[1][1] && tablero[1][0] == tablero[1][2] && tablero[1][0] != 0 
                    || tablero[2][0] == tablero[2][1] && tablero[2][0] == tablero[2][2] && tablero[2][0] != 0 
                    || tablero[0][0] == tablero[0][1] && tablero[0][0] == tablero[0][2] && tablero[0][0] != 0 
                    || tablero[1][0] == tablero[1][1] && tablero[1][0] == tablero[1][2] && tablero[1][0] != 0 
                    || tablero[2][0] == tablero[2][1] && tablero[2][0] == tablero[2][2] && tablero[2][0] != 0 
                    ){
                        juego = juego+9;
                         
                        if(turno%2 == 0){
                            ganador = 'X';
                        }else{
                            ganador = 'O';
                        }
                    }
                }
            }
            turno++;
            for(int i = 0; i<3;i++){
                System.out.print( "|");
                
                for(int z = 0; z<3;z++){
                    if(tablero[i][z] == 1){
                        System.out.print("\u001B[34mX\u001B[0m|");
                        
                    }if(tablero[i][z] == 0){
                        System.out.print(" |");
                    }if(tablero[i][z] == 2){
                        System.out.print("\u001B[32mO\u001B[0m|");
                        
                    }
                }
                System.out.println();

            }
            if(juego<9){
            if(turno%2 != 0){
            System.out.println("Turno del O: ");
            String posicion_O = s.nextLine();
            fila_o = posicion_O.charAt(0)-49;
            columna_o = posicion_O.charAt(1)-49;
            tablero[fila_o][columna_o] = 2;
            }if(turno%2 == 0){
                System.out.println("Turno del X: ");
                posicion = s.nextLine();
                fila_x = posicion.charAt(0)-49;
                columna_x = posicion.charAt(1)-49;
                tablero[fila_x][columna_x] = 1;
            }
          }
            
     
            }
            System.out.println("Has ganado "+ganador);
            s.close();
        }
     }


