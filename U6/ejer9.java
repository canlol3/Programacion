package U6;

public class ejer9 {
    public static void main(String[] args) {
        int num = 0;
        int cant = 0;
        while( num != 24){
            num = (int)(Math.random()*51)*2;
            System.out.print(" "+num);
            cant++;
        }
        System.out.println();
        System.out.println("He tenido que generar "+cant+" números para conseguir un 24");

    }
}
