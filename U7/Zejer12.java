package U7;

public class Zejer12 {
    public static void main(String[] args) {
        int numeros[][] = new int[9][9];
        for(int z = 0; z<9;z++){
            for(int i = 0; i<9;i++){
                numeros[i][z] = (int)(Math.random()*400)+500;
                System.out.printf("%3d ",numeros[i][z]);
            }
            System.out.println();
        }
        int i = 8;
        System.out.println();
        int maximo = 0;
        int minimo = 900;
        int media = 0;
        for(int z = 0; z<9; z++){
            System.out.printf("%3d ",numeros[z][i]);
          
            if(maximo < numeros[z][i]){
                maximo = numeros[z][i];
            }
            if(minimo > numeros[z][i]){
                minimo = numeros[z][i];
            }
            media = media + numeros[z][i];
            i--;
            
        }
        System.out.println();
        System.out.printf("El maximo es -> %2d El minimo es -> %2d\nLa media es -> %2d\n",maximo,minimo,media );
    }
}
