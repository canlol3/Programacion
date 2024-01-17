package U7;

public class Zejer5 {
    public static void main(String[] args) {
        int num[][] = new int[6][10];
        int mayor = 0;
        int menor = 1000;
        for(int fila = 0; fila <6; fila++){
            for(int columna = 0; columna<10; columna++){
                num[fila][columna] = (int)(Math.random()*1000);
                System.out.printf("%3d ",num[fila][columna]);
                if(mayor < num[fila][columna]){
                    mayor = num[fila][columna];
                }if(menor>num[fila][columna]){
                    menor = num[fila][columna];
                }
            }
            System.out.println();
        }
        System.out.print("El mayor es --> "+mayor + " y el menor es --> "+menor);
        System.out.println();
    }
}
