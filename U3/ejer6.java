package U3;
public class ejer6 {
    public static void main(String[] args){
        int base;
        int altura;
        String res;
        System.out.println("Introduce la base de tu triangulo");
        res = System.console() .readLine();
        base = Integer.parseInt(res);
        System.out.println("Introduce la altura de tu triangulo");
        res = System.console() .readLine();
        altura = Integer.parseInt(res);
        System.out.println((base*altura)/2);
    }
    
}
