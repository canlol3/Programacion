package U4;

public class ejer7 {
    public static void main(String[] args){

        System.out.println("¿Cual es tu primera nota?");
        String res = System.console() .readLine();
        double a = Integer.parseInt(res);

        System.out.println("¿Cual es tu segunda nota?");
        String res2 = System.console() .readLine();
        double b = Integer.parseInt(res2);

        System.out.println("¿Cual es tu tercera nota?");
        String res3 = System.console() .readLine();
        double c = Integer.parseInt(res3);

        System.out.printf("%.3f es tu nota media \n", (a+b+c)/3);
    }
}
