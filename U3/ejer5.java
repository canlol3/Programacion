package U3;

public class ejer5 {
    public static void main(String[] args){
        int altura;
        int base;
        String res;
        System.out.println("Introduce la altura de tu rectágunlo");
        res = System.console() .readLine();
        altura = Integer.parseInt(res);
        System.out.println("Introduce la base de tu rectágunlo");
        res = System.console() .readLine();
        base = Integer.parseInt(res);
        System.out.println(base * altura);
    }
}
