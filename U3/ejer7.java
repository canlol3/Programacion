package U3;

public class ejer7 {
    public static void main(String[] args){
        int fact;
        String res;
        System.out.println("Introduce tu factura en bruto");
        res = System.console() .readLine();
        fact = Integer.parseInt(res);
        System.out.println(fact * 1.21);
    }
}
