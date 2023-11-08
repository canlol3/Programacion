package U3;

public class ejer9 {
    public static void main(String[] args){
        String res;
        int altura;
        int radio;
        System.out.println("Cual es la altura de tu cono?");
        res = System.console() .readLine();
        altura = Integer.parseInt(res);
        System.out.println("Cual es el radio de tu cono?");
        res = System.console() .readLine();
        radio = Integer.parseInt(res);
        System.out.println( (Math.pow(radio,2) * altura)/3 );
    }
}