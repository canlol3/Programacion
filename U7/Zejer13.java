package U7;

import java.util.concurrent.Flow.Subscriber;

public class Zejer13 {
    public static void main(String[] args) {
        String[] pais = new String[4];
        pais[0] = "España";
        pais[1] = "Rusia";
        pais[2] = "Japón";
        pais[3] = "Australia";
        int[][] estatura = new int[4][10];
        int maximo_Sp = 0;
        int minimo_Sp = 210;
        int media_Sp = 0;
        int maximo_Rs = 0;
        int minimo_Rs = 210;
        int media_Rs = 0;
        int maximo_Jp = 0;
        int minimo_Jp = 210;
        int media_Jp = 0;
        int maximo_As = 0;
        int minimo_As = 210;
        int media_As = 0;
        System.out.println("Media Mínima Máxima ");
        for(int fila = 0; fila<4; fila++){
            for(int columna=0; columna<10; columna++){
                estatura[fila][columna] = (int)(Math.random()*70)+140;
                System.out.print(" "+estatura[fila][columna] + " ");
                if(fila == 0 && maximo_Sp < estatura[fila][columna]){
                    maximo_Sp = estatura[fila][columna];
                }
                if(fila == 0 && minimo_Sp > estatura[fila][columna]){
                    minimo_Sp = estatura[fila][columna];
                }
                if(fila == 0){
                    media_Sp = media_Sp + estatura[fila][columna];
                }


                if(fila == 1 && maximo_Rs < estatura[fila][columna]){
                    maximo_Rs = estatura[fila][columna];
                }
                if(fila == 1 && minimo_Rs > estatura[fila][columna]){
                    minimo_Rs = estatura[fila][columna];
                }
                if(fila == 1){
                    media_Rs = media_Rs + estatura[fila][columna];
                }


                if(fila == 2 && maximo_Jp < estatura[fila][columna]){
                    maximo_Jp = estatura[fila][columna];
                }
                if(fila == 2 && minimo_Jp > estatura[fila][columna]){
                    minimo_Jp = estatura[fila][columna];
                }
                if(fila == 2){
                    media_Jp = media_Jp + estatura[fila][columna];
                }


                if(fila == 3 && maximo_As < estatura[fila][columna]){
                    maximo_As = estatura[fila][columna];
                }
                if(fila == 3 && minimo_As > estatura[fila][columna]){
                    minimo_As = estatura[fila][columna];
                }
                if(fila == 3){
                    media_As = media_As + estatura[fila][columna];
                }

            }
            System.out.println();
        }
        media_Sp = (int)media_Sp/10;
        media_Jp = (int)media_Jp/10;
        media_Rs = (int)media_Rs/10;
        media_As = (int)media_As/10;

        System.out.println(" "+ maximo_Sp + " " + minimo_Sp + " "+media_Sp);
        for(int columna = 0; columna<4; columna++){
            if(columna == 0){
            System.out.print(" " +pais[columna] + " " +maximo_Sp+" "+minimo_Sp+" " +media_Sp);
            System.out.println();
            }
            if(columna == 1){
                System.out.print(" " +pais[columna] + " " +maximo_Rs+" "+minimo_Rs+" " +media_Rs);
                System.out.println();

            }
            if(columna == 2){
                System.out.print(" " +pais[columna] + " " +maximo_Jp+" "+minimo_Jp+" " +media_Jp);
                System.out.println();

            }
            if(columna == 3){
                System.out.print(" " +pais[columna] + " " +maximo_As+" "+minimo_As+" " +media_As);
                System.out.println();

            }
        }

    }
}
