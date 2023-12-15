package U7;

public class ejer4 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.print("| valor original |");
        for(int i = 0; i<20; i++){
            numero[i] = (int)(Math.random()*100);
            System.out.print(numero[i] + "   ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.print("| cuadrado|");
        int[] cuadrado = new int[20];
        for(int i = 0; i<20; i++){
            cuadrado[i] = (int)Math.pow(numero[i], 2);
            System.out.print(cuadrado[i] + "  ");
        }
        System.out.println();
        int[] cubo = new int[20];
        for(int i = 0; i<20; i++){
            cubo[i] = (int)Math.pow(numero[i], 3);
            System.out.print(cubo[i] + " ");
        }
        System.out.println();
    }
}
