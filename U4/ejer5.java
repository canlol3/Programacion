package U4;

public class ejer5 {
    public static void main(String[] args){
        System.out.println("Este programa resuelve ecuaciones de primer grado ax + b");
        System.out.println("Introduce el valor de a");
        String res = System.console() .readLine();
        int a = Integer.parseInt(res);
        System.out.println("Introduce el valor de b");
        String res2 = System.console() .readLine();
        int b = Integer.parseInt(res2);
        System.out.println("El valor de x es = " + (-b)/a );
    }
}
